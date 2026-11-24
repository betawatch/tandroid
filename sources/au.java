// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class au implements View.OnLongClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ au(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(View view) {
        yv1 yv1Var;
        final tca tcaVar = (tca) this.b;
        vi3 vi3Var = tcaVar.o1;
        boolean z = tcaVar.c2;
        Activity activity = tcaVar.b2;
        final byte b = 0;
        if (activity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(tcaVar.getContext());
        final byte b2 = 1;
        linearLayout.setOrientation(1);
        byte b3 = 2;
        if (tcaVar.I1 != null) {
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, tcaVar.J0);
            if (z) {
                anb.h(cmb.Vg, tcaVar.J0, actionBarPopupWindow$ActionBarPopupWindowLayout);
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setOnTouchListener(new dca(tcaVar, (byte) 0));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new pba(tcaVar, b3));
            actionBarPopupWindow$ActionBarPopupWindowLayout.setShownFromBottom(false);
            final a8 a8Var = new a8(1, tcaVar.J0, tcaVar.getContext(), true, false);
            if (z) {
                a8Var.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var, qoe.o(-1, 48));
            a8Var.j(jb6.M0(2131745065, null), 0, null);
            tcaVar.D2 = true;
            a8Var.setChecked(true);
            final a8 a8Var2 = new a8(1, tcaVar.J0, tcaVar.getContext(), false, true);
            if (z) {
                a8Var2.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            }
            actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, qoe.o(-1, 48));
            a8Var2.j(jb6.M0(2131749065, null), 0, null);
            a8Var2.setChecked(!tcaVar.D2);
            a8Var.setOnClickListener(new View.OnClickListener() { // from class: sba
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b;
                    a8 a8Var3 = a8Var2;
                    a8 a8Var4 = a8Var;
                    tca tcaVar2 = tcaVar;
                    switch (b4) {
                        case 0:
                            tcaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!tcaVar2.D2);
                            break;
                        default:
                            tcaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!tcaVar2.D2);
                            break;
                    }
                }
            });
            a8Var2.setOnClickListener(new View.OnClickListener() { // from class: sba
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    byte b4 = b2;
                    a8 a8Var3 = a8Var2;
                    a8 a8Var4 = a8Var;
                    tca tcaVar2 = tcaVar;
                    switch (b4) {
                        case 0:
                            tcaVar2.D2 = true;
                            a8Var4.setChecked(true);
                            a8Var3.setChecked(!tcaVar2.D2);
                            break;
                        default:
                            tcaVar2.D2 = false;
                            a8Var4.setChecked(false);
                            a8Var3.setChecked(!tcaVar2.D2);
                            break;
                    }
                }
            });
            tca.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout, cmb.H5, tcaVar.J0);
            linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, qoe.k(0.0f, 0.0f, 0.0f, -8.0f, -1, -2));
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(activity, tcaVar.J0);
        if (z) {
            anb.h(cmb.Vg, null, actionBarPopupWindow$ActionBarPopupWindowLayout2);
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setOnTouchListener(new dca(tcaVar, (byte) 1));
        byte b4 = 3;
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setDispatchKeyEventListener(new pba(tcaVar, b4));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.setShownFromBottom(false);
        a8 a8Var3 = new a8(0, tcaVar.J0, tcaVar.getContext(), true, true);
        if (z) {
            a8Var3.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            a8Var3.setIconColor(cmb.v0(cmb.G6, tcaVar.J0));
        }
        a8Var3.j(jb6.M0(2131745317, null), R.drawable.input_notify_off, null);
        a8Var3.setMinimumWidth(gm.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var3, qoe.o(-1, 48));
        a8Var3.setOnClickListener(new oba(tcaVar, b3));
        a8 a8Var4 = new a8(0, tcaVar.J0, tcaVar.getContext(), true, true);
        if (z) {
            a8Var4.setTextColor(cmb.v0(cmb.dh, tcaVar.J0));
            a8Var4.setIconColor(cmb.v0(cmb.G6, tcaVar.J0));
        }
        a8Var4.j(jb6.M0(2131745335, null), R.drawable.msg_send, null);
        a8Var4.setMinimumWidth(gm.L(196.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout2.a(a8Var4, qoe.o(-1, 48));
        a8Var4.setOnClickListener(new oba(tcaVar, b4));
        tca.Q0(actionBarPopupWindow$ActionBarPopupWindowLayout2, cmb.H5, tcaVar.J0);
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout2, qoe.o(-1, -2));
        m8 m8Var = new m8(linearLayout, -2, -2);
        tcaVar.E2 = m8Var;
        m8Var.b = false;
        m8Var.setAnimationStyle(R.style.PopupContextAnimation2);
        tcaVar.E2.setOutsideTouchable(true);
        tcaVar.E2.setClippingEnabled(true);
        tcaVar.E2.setInputMethodMode(2);
        tcaVar.E2.setSoftInputMode(0);
        tcaVar.E2.getContentView().setFocusableInTouchMode(true);
        boolean z2 = gda.a;
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putInt("scheduledOrNoSoundHintShows", 3);
        edit.apply();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
        tcaVar.E2.setFocusable(true);
        int[] iArr = new int[2];
        vi3Var.getLocationInWindow(iArr);
        tcaVar.E2.showAtLocation(vi3Var, 51, gm.L(8.0f) + ((vi3Var.getMeasuredWidth() + iArr[0]) - linearLayout.getMeasuredWidth()), (!tcaVar.d || (yv1Var = tcaVar.a2) == null || yv1Var.m1.getMeasuredHeight() <= gm.L(58.0f)) ? (iArr[1] - linearLayout.getMeasuredHeight()) - gm.L(2.0f) : vi3Var.getMeasuredHeight() + iArr[1]);
        tcaVar.E2.b();
        try {
            vi3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x0432, code lost:
    
        if (((co6) r7).g == null) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x043e, code lost:
    
        if (r10.b() != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0450, code lost:
    
        if (r8.isEmpty() != false) goto L201;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0484 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x048d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04b4  */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r1v1, types: [bu5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v66, types: [bu5] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.Collection] */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        WebBackForwardList webBackForwardList;
        boolean z;
        boolean z2;
        TLRPC.User W1;
        boolean b;
        boolean z3;
        boolean z4;
        bu5 G;
        pb8 pb8Var;
        boolean lambda$show$8;
        byte b2 = this.a;
        Object obj = this.b;
        ?? r15 = 0;
        byte b3 = 1;
        switch (b2) {
            case 0:
                final o oVar = (o) obj;
                ArrayList arrayList = oVar.e0;
                if (oVar.v0[0] != null) {
                    float f = oVar.i0.N.d;
                    sx sxVar = oVar.L;
                    ?? G2 = bu5.G(sxVar != null ? sxVar.c : oVar.g0, null, view);
                    int w0 = gda.s0 ? cmb.w0(null, cmb.Fl, false) : oVar.v0[0].getBackgroundColor();
                    int w02 = gda.s0 ? cmb.w0(null, cmb.F6, false) : gm.B(oVar.v0[0].getBackgroundColor()) >= 0.721f ? -16777216 : -1;
                    int p1 = cmb.p1(0.65f, w02);
                    mw0 webView = oVar.v0[0].getWebView();
                    if (webView != null) {
                        WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                        int currentIndex = copyBackForwardList.getCurrentIndex();
                        if (copyBackForwardList.getCurrentIndex() > 0) {
                            int i = 0;
                            while (i < currentIndex) {
                                WebHistoryItem itemAtIndex = copyBackForwardList.getItemAtIndex(i);
                                G2.b(r15, itemAtIndex.getTitle(), new cu(currentIndex, i, webView, (byte) r15), r15);
                                a8 z5 = G2.z();
                                if (z5 != null) {
                                    z5.setSubtext(itemAtIndex.getUrl());
                                    Bitmap bitmap = (Bitmap) webView.Q.get(itemAtIndex.getUrl());
                                    if (bitmap == null) {
                                        bitmap = itemAtIndex.getFavicon();
                                    }
                                    webBackForwardList = copyBackForwardList;
                                    z5.j(itemAtIndex.getTitle(), 0, new xu(bitmap, new Paint(3), (byte) 0));
                                    z5.setTextColor(w02);
                                    z5.setSubtextColor(p1);
                                } else {
                                    webBackForwardList = copyBackForwardList;
                                }
                                i++;
                                copyBackForwardList = webBackForwardList;
                                r15 = 0;
                            }
                        }
                    }
                    for (final int size = arrayList.size() - 2; size >= 0; size--) {
                        Object obj2 = arrayList.get(size);
                        if (obj2 instanceof zw) {
                            zw zwVar = (zw) obj2;
                            final byte b4 = 0;
                            G2.b(0, zwVar.b(), new Runnable() { // from class: du
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    int i2 = size;
                                    o oVar2 = oVar;
                                    switch (b5) {
                                        case 0:
                                            oVar2.E(i2);
                                            break;
                                        default:
                                            oVar2.E(i2);
                                            break;
                                    }
                                }
                            }, false);
                            a8 z6 = G2.z();
                            if (z6 != null) {
                                z6.setSubtext(zwVar.x);
                                Bitmap bitmap2 = webView != null ? (Bitmap) webView.Q.get(zwVar.x) : null;
                                if (bitmap2 == null) {
                                    bitmap2 = zwVar.F;
                                }
                                z6.j(zwVar.b(), 0, new xu(bitmap2, new Paint(3), (byte) 1));
                                z6.setTextColor(w02);
                                z6.setSubtextColor(p1);
                                z6.d(w02, w02);
                            }
                        } else if (obj2 instanceof TLRPC.WebPage) {
                            TLRPC.WebPage webPage = (TLRPC.WebPage) obj2;
                            final byte b5 = 1;
                            G2.b(0, webPage.title, new Runnable() { // from class: du
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b5;
                                    int i2 = size;
                                    o oVar2 = oVar;
                                    switch (b52) {
                                        case 0:
                                            oVar2.E(i2);
                                            break;
                                        default:
                                            oVar2.E(i2);
                                            break;
                                    }
                                }
                            }, false);
                            a8 z7 = G2.z();
                            if (z7 != null) {
                                s09 s09Var = z7.c;
                                z7.j(webPage.title, R.drawable.msg_instant, null);
                                z7.setTextColor(w02);
                                if (!TextUtils.isEmpty(webPage.site_name)) {
                                    z7.setSubtext(webPage.site_name);
                                }
                                z7.setSubtextColor(p1);
                                s09Var.getLayoutParams().width = gm.L(24.0f);
                                s09Var.setScaleX(1.45f);
                                s09Var.setScaleY(1.45f);
                                z7.d(w02, w02);
                            }
                        }
                    }
                    G2.X(cmb.K(gm.L(40.0f), oVar.i0.getBackgroundColor()));
                    G2.Q(w0);
                    if (G2.y() > 0) {
                        oVar.j(new eu(oVar, G2, f, (byte) 0));
                        return true;
                    }
                }
                return false;
            case 1:
                h91 h91Var = (h91) obj;
                k91 k91Var = h91Var.y;
                if (h91Var.n != null) {
                    int i2 = -1;
                    int i3 = -1;
                    for (int i4 = 0; i4 < h91Var.d; i4++) {
                        i91 i91Var = (i91) h91Var.n.get(i4, null);
                        if (i91Var != null) {
                            if (i3 == -1) {
                                i3 = i91Var.h;
                            }
                            i2 = i91Var.h;
                        }
                    }
                    if (i3 >= 0 && i2 >= 0) {
                        k91Var.H = true;
                        k91Var.Q = i3;
                        k91Var.R = i2;
                        k91Var.B0();
                        k91Var.s0();
                    }
                }
                return false;
            case 2:
                lt1 lt1Var = (lt1) obj;
                yv1 yv1Var = lt1Var.c;
                if (gm.O1()) {
                    return false;
                }
                if (yv1Var.j8() && !m9c.v(yv1Var.f)) {
                    return false;
                }
                lt1Var.b = lt1Var.a;
                yv1Var.xa(true);
                return true;
            case 3:
                ((m43) obj).c.callOnClick();
                return true;
            case 4:
                final FragmentContextView fragmentContextView = (FragmentContextView) obj;
                float[] fArr = FragmentContextView.W0;
                final float x = MediaController.w().x(fragmentContextView.W);
                fragmentContextView.I.e(false, x);
                v7 v7Var = fragmentContextView.I;
                int i5 = cmb.F8;
                anb.h(i5, fragmentContextView.q0, v7Var);
                v7 v7Var2 = fragmentContextView.I;
                v7Var2.O = fragmentContextView.h instanceof yv1;
                v7Var2.G.setShader(null);
                v7Var2.h = null;
                Bitmap bitmap3 = v7Var2.f;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    v7Var2.f = null;
                }
                fragmentContextView.G.I(cmb.w0(null, i5, false));
                fragmentContextView.G.V();
                fragmentContextView.q(false);
                fragmentContextView.G.setDimMenu(0.3f);
                fragmentContextView.G.U(fragmentContextView.I, null);
                fragmentContextView.G.setOnMenuDismiss(new qac() { // from class: kp4
                    @Override // qac
                    public final void a(Object obj3) {
                        float[] fArr2 = FragmentContextView.W0;
                        if (((Boolean) obj3).booleanValue()) {
                            return;
                        }
                        MediaController w = MediaController.w();
                        FragmentContextView fragmentContextView2 = FragmentContextView.this;
                        fragmentContextView2.l(x, w.x(fragmentContextView2.W), false);
                    }
                });
                oc7.e1().edit().putInt("speedhint", -15).apply();
                return true;
            case 5:
                ry5 ry5Var = (ry5) obj;
                int i6 = ry5Var.F1;
                if (ry5Var.I1 == null) {
                    return true;
                }
                m58 e = m58.e(i6);
                e.k = !e.k;
                e.a.edit().putBoolean("fill_shapes", e.k).apply();
                boolean z8 = m58.e(i6).k;
                for (int i7 = 0; i7 < ry5Var.I1.getItemsCount(); i7++) {
                    View childAt = ry5Var.I1.M.getChildAt(i7);
                    if (childAt instanceof py5) {
                        t11 t11Var = (t11) t11.c.get(i7);
                        ((py5) childAt).a(z8 ? t11Var.l() : t11Var.d(), z8, true);
                    }
                }
                return true;
            case 6:
                xv7 xv7Var = (xv7) obj;
                int i8 = xv7Var.v1;
                if (xv7Var.y1 == null) {
                    return true;
                }
                m58 e2 = m58.e(i8);
                e2.k = !e2.k;
                e2.a.edit().putBoolean("fill_shapes", e2.k).apply();
                boolean z9 = m58.e(i8).k;
                for (int i9 = 0; i9 < xv7Var.y1.getItemsCount(); i9++) {
                    View childAt2 = xv7Var.y1.M.getChildAt(i9);
                    if (childAt2 instanceof vv7) {
                        t11 t11Var2 = (t11) t11.c.get(i9);
                        ((vv7) childAt2).a(z9 ? t11Var2.l() : t11Var2.d(), z9, true);
                    }
                }
                return true;
            case 7:
                by7 by7Var = (by7) obj;
                by7Var.r.setText("");
                by7Var.s.b(true);
                Drawable drawable = by7Var.a;
                if (drawable instanceof ah7) {
                    ((ah7) drawable).w();
                }
                return true;
            case 8:
                j68 j68Var = (j68) obj;
                yv1 yv1Var2 = j68Var.G;
                if (yv1Var2 != null && j68Var.H != 1) {
                    TLRPC.User h = yv1Var2.h();
                    if (j68Var.K == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(j68Var.getParentActivity(), null);
                        j68Var.K = actionBarPopupWindow$ActionBarPopupWindowLayout;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setAnimationEnabled(false);
                        j68Var.K.setOnTouchListener(new ly1(j68Var));
                        j68Var.K.setDispatchKeyEventListener(new e68(j68Var, (byte) 1));
                        j68Var.K.setShownFromBottom(false);
                        j68Var.L = new a8[2];
                        int i10 = 0;
                        for (int i11 = 2; i10 < i11; i11 = 2) {
                            if ((i10 != 0 || yv1Var2.M4()) && (i10 != 1 || !m9c.D(h))) {
                                j68Var.L[i10] = new a8(j68Var.getParentActivity(), i10 == 0, i10 == 1);
                                a8[] a8VarArr = j68Var.L;
                                if (i10 != 0) {
                                    a8VarArr[i10].j(jb6.M0(2131745317, null), R.drawable.input_notify_off, null);
                                } else if (m9c.D(h)) {
                                    a8VarArr[i10].j(jb6.M0(2131745248, null), R.drawable.msg_calendar2, null);
                                } else {
                                    a8VarArr[i10].j(jb6.M0(2131745593, null), R.drawable.msg_calendar2, null);
                                }
                                j68Var.L[i10].setMinimumWidth(gm.L(196.0f));
                                j68Var.K.a(j68Var.L[i10], qoe.o(-1, 48));
                                j68Var.L[i10].setOnClickListener(new v0(j68Var, i10, (byte) 13));
                            }
                            i10++;
                        }
                        j68Var.K.setupRadialSelectors(cmb.w0(null, cmb.H5, false));
                        m8 m8Var = new m8(j68Var.K, -2, -2);
                        j68Var.J = m8Var;
                        m8Var.b = false;
                        m8Var.setAnimationStyle(R.style.PopupContextAnimation2);
                        z = true;
                        j68Var.J.setOutsideTouchable(true);
                        j68Var.J.setClippingEnabled(true);
                        j68Var.J.setInputMethodMode(2);
                        j68Var.J.setSoftInputMode(0);
                        j68Var.J.getContentView().setFocusableInTouchMode(true);
                    } else {
                        z = true;
                    }
                    j68Var.K.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                    j68Var.J.setFocusable(z);
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    j68Var.J.showAtLocation(view, 51, gm.L(8.0f) + ((view.getMeasuredWidth() + iArr[0]) - j68Var.K.getMeasuredWidth()), (iArr[1] - j68Var.K.getMeasuredHeight()) - gm.L(2.0f));
                    j68Var.J.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                return false;
            case 9:
                w78 w78Var = (w78) obj;
                yv1 yv1Var3 = w78Var.V;
                if (yv1Var3 != null && w78Var.I != 1) {
                    TLRPC.User h2 = yv1Var3.h();
                    if (w78Var.o0 == null) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(w78Var.getParentActivity(), null);
                        w78Var.o0 = actionBarPopupWindow$ActionBarPopupWindowLayout2;
                        actionBarPopupWindow$ActionBarPopupWindowLayout2.setAnimationEnabled(false);
                        w78Var.o0.setOnTouchListener(new ly1(w78Var));
                        w78Var.o0.setDispatchKeyEventListener(new o78(w78Var, (byte) 4));
                        w78Var.o0.setShownFromBottom(false);
                        w78Var.p0 = new a8[2];
                        int i12 = 0;
                        for (int i13 = 2; i12 < i13; i13 = 2) {
                            if ((i12 != 0 || yv1Var3.M4()) && (i12 != 1 || !m9c.D(h2))) {
                                w78Var.p0[i12] = new a8(w78Var.getParentActivity(), i12 == 0, i12 == 1);
                                a8[] a8VarArr2 = w78Var.p0;
                                if (i12 != 0) {
                                    a8VarArr2[i12].j(jb6.M0(2131745317, null), R.drawable.input_notify_off, null);
                                } else if (m9c.D(h2)) {
                                    a8VarArr2[i12].j(jb6.M0(2131745248, null), R.drawable.msg_calendar2, null);
                                } else {
                                    a8VarArr2[i12].j(jb6.M0(2131745593, null), R.drawable.msg_calendar2, null);
                                }
                                w78Var.p0[i12].setMinimumWidth(gm.L(196.0f));
                                w78Var.o0.a(w78Var.p0[i12], qoe.o(-1, 48));
                                w78Var.p0[i12].setOnClickListener(new v0(w78Var, i12, (byte) 14));
                            }
                            i12++;
                        }
                        w78Var.o0.setupRadialSelectors(cmb.w0(null, w78Var.x0, false));
                        m8 m8Var2 = new m8(w78Var.o0, -2, -2);
                        w78Var.n0 = m8Var2;
                        m8Var2.b = false;
                        m8Var2.setAnimationStyle(R.style.PopupContextAnimation2);
                        z2 = true;
                        w78Var.n0.setOutsideTouchable(true);
                        w78Var.n0.setClippingEnabled(true);
                        w78Var.n0.setInputMethodMode(2);
                        w78Var.n0.setSoftInputMode(0);
                        w78Var.n0.getContentView().setFocusableInTouchMode(true);
                    } else {
                        z2 = true;
                    }
                    w78Var.o0.measure(View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(1000.0f), TLObject.FLAG_31));
                    w78Var.n0.setFocusable(z2);
                    int[] iArr2 = new int[2];
                    view.getLocationInWindow(iArr2);
                    w78Var.n0.showAtLocation(view, 51, gm.L(8.0f) + ((view.getMeasuredWidth() + iArr2[0]) - w78Var.o0.getMeasuredWidth()), (iArr2[1] - w78Var.o0.getMeasuredHeight()) - gm.L(2.0f));
                    w78Var.n0.b();
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                }
                return false;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                pb8 pb8Var2 = photoViewer.d;
                if ((pb8Var2 != null && !pb8Var2.V()) || photoViewer.d2 == 11) {
                    return false;
                }
                d dVar = photoViewer.l4;
                boolean z10 = (dVar == null || dVar.getLastStoryViewer() == null) ? false : true;
                yv1 yv1Var4 = photoViewer.k4;
                if (yv1Var4 != null && yv1Var4.X7()) {
                    return false;
                }
                if ((photoViewer.k4 == null && !z10 && photoViewer.d == null) || photoViewer.V1.o()) {
                    return false;
                }
                yv1 yv1Var5 = photoViewer.k4;
                if (yv1Var5 != null) {
                    W1 = yv1Var5.h();
                    b = photoViewer.k4.M4();
                } else {
                    pb8 pb8Var3 = photoViewer.d;
                    if (pb8Var3 == null) {
                        return false;
                    }
                    long a = pb8Var3.a();
                    W1 = a != 0 ? oc7.r1(photoViewer.U).W1(Long.valueOf(a)) : null;
                    b = photoViewer.d.b();
                }
                pb8 pb8Var4 = photoViewer.d;
                boolean z11 = pb8Var4 != null && pb8Var4.o();
                pb8 pb8Var5 = photoViewer.d;
                boolean z12 = pb8Var5 != null && pb8Var5.q();
                boolean D = m9c.D(W1);
                pb8 pb8Var6 = photoViewer.d;
                if (pb8Var6 != null && pb8Var6.u() != null) {
                    Iterator it = photoViewer.d.u().entrySet().iterator();
                    while (it.hasNext()) {
                        Object value = ((Map.Entry) it.next()).getValue();
                        if (value instanceof jo6) {
                            if (((jo6) value).x != 0) {
                                z3 = true;
                            }
                        } else if ((value instanceof no6) && ((no6) value).x != 0) {
                            z3 = true;
                        }
                        if (!z11) {
                            aa8 aa8Var = photoViewer.V1;
                            if ((!aa8Var.U0 || aa8Var.b1 <= 0) && ((pb8Var = photoViewer.d) == null || pb8Var.I())) {
                                ?? r6 = photoViewer.f7;
                                int i14 = photoViewer.O4;
                                Object obj3 = (i14 < 0 || i14 >= r6.size()) ? null : r6.get(photoViewer.O4);
                                if (photoViewer.s1) {
                                    ib8 ib8Var = photoViewer.W4;
                                    if (!photoViewer.r) {
                                        if (photoViewer.t8 <= 0.0f) {
                                            if (photoViewer.u8 >= 1.0f) {
                                                if (obj3 instanceof co6) {
                                                    break;
                                                }
                                                if (ib8Var != null) {
                                                    ao6 ao6Var = ib8Var.c;
                                                    if (ao6Var != null) {
                                                        break;
                                                    }
                                                    if (ib8Var.d == null) {
                                                        if (ib8Var.a == null) {
                                                            ArrayList arrayList2 = ib8Var.e;
                                                            if (arrayList2 != null) {
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                pb8 pb8Var7 = photoViewer.d;
                                HashMap u = pb8Var7 != null ? pb8Var7.u() : null;
                                if (u != null) {
                                    r6 = u.values();
                                }
                                for (Object obj4 : r6) {
                                    if (obj4 == obj3 || !(obj4 instanceof co6) || !((co6) obj4).b()) {
                                    }
                                }
                                z4 = true;
                                boolean z13 = z11 && b && !z3;
                                boolean z14 = (z11 || !z12) && !D;
                                pb8 pb8Var8 = photoViewer.d;
                                boolean z15 = pb8Var8 == null && pb8Var8.H() > 1;
                                G = bu5.G(photoViewer.f0, new r63(), view);
                                G.k(R.drawable.msg_sendfile, jb6.M0(z15 ? 2131745369 : 2131745370, null), new n88(photoViewer, (byte) 28), z4);
                                G.k(R.drawable.msg_send, jb6.M0(2131745368, null), new n88(photoViewer, (byte) 29), z12);
                                G.k(R.drawable.msg_replace, jb6.M0(2131746002, null), new b98(photoViewer, r15 == true ? (byte) 1 : (byte) 0), z12);
                                G.k(R.drawable.msg_calendar2, jb6.M0(D ? 2131745248 : 2131745593, null), new b98(photoViewer, (byte) 1), z13);
                                G.k(R.drawable.input_notify_off, jb6.M0(2131745317, null), new b98(photoViewer, (byte) 2), z14);
                                if (G.y() == 0) {
                                    return false;
                                }
                                G.W(5);
                                G.a0();
                                return true;
                            }
                        }
                        z4 = false;
                        if (z11) {
                        }
                        if (z11) {
                        }
                        pb8 pb8Var82 = photoViewer.d;
                        if (pb8Var82 == null) {
                        }
                        G = bu5.G(photoViewer.f0, new r63(), view);
                        G.k(R.drawable.msg_sendfile, jb6.M0(z15 ? 2131745369 : 2131745370, null), new n88(photoViewer, (byte) 28), z4);
                        G.k(R.drawable.msg_send, jb6.M0(2131745368, null), new n88(photoViewer, (byte) 29), z12);
                        G.k(R.drawable.msg_replace, jb6.M0(2131746002, null), new b98(photoViewer, r15 == true ? (byte) 1 : (byte) 0), z12);
                        G.k(R.drawable.msg_calendar2, jb6.M0(D ? 2131745248 : 2131745593, null), new b98(photoViewer, (byte) 1), z13);
                        G.k(R.drawable.input_notify_off, jb6.M0(2131745317, null), new b98(photoViewer, (byte) 2), z14);
                        if (G.y() == 0) {
                        }
                    }
                }
                z3 = false;
                if (!z11) {
                }
                z4 = false;
                if (z11) {
                }
                if (z11) {
                }
                pb8 pb8Var822 = photoViewer.d;
                if (pb8Var822 == null) {
                }
                G = bu5.G(photoViewer.f0, new r63(), view);
                G.k(R.drawable.msg_sendfile, jb6.M0(z15 ? 2131745369 : 2131745370, null), new n88(photoViewer, (byte) 28), z4);
                G.k(R.drawable.msg_send, jb6.M0(2131745368, null), new n88(photoViewer, (byte) 29), z12);
                G.k(R.drawable.msg_replace, jb6.M0(2131746002, null), new b98(photoViewer, r15 == true ? (byte) 1 : (byte) 0), z12);
                G.k(R.drawable.msg_calendar2, jb6.M0(D ? 2131745248 : 2131745593, null), new b98(photoViewer, (byte) 1), z13);
                G.k(R.drawable.input_notify_off, jb6.M0(2131745317, null), new b98(photoViewer, (byte) 2), z14);
                if (G.y() == 0) {
                }
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                if (profileActivity.K2 == null && !profileActivity.q1) {
                    profileActivity.d3(false);
                }
                return false;
            case 12:
                return ((ne9) obj).length() != 0;
            case 13:
                return ((jf9) obj).p0(view);
            case 14:
                p82 p82Var = ((l82) obj).a;
                hh9 hh9Var = p82Var.s;
                ylb ylbVar = p82Var.a;
                i22 i22Var = p82Var.b;
                ch9 ch9Var = p82Var.r;
                int i15 = p82Var.n;
                if (!z8c.h(i15).p()) {
                    new kj8(i22Var.Z1, p82Var.getContext(), p82Var.n, 43, true).show();
                    return true;
                }
                if (!ch9Var.g3() || ch9Var.i3()) {
                    return false;
                }
                if (!ch9Var.I3()) {
                    if (hh9Var == null) {
                        return false;
                    }
                    hh9Var.setSendEnabled(ch9Var.I3());
                    return false;
                }
                ArrayList<TL_iv.PageBlock> V2 = ch9Var.V2();
                if (V2.isEmpty()) {
                    return false;
                }
                d dVar2 = i22Var.Z1;
                yv1 yv1Var6 = dVar2 instanceof yv1 ? (yv1) dVar2 : null;
                j67 j67Var = p82Var.P;
                if (j67Var != null) {
                    j67Var.f(false);
                    p82Var.P = null;
                }
                j67 j67Var2 = new j67(p82Var.getContext(), ylbVar);
                p82Var.P = j67Var2;
                j67Var2.setOnDismissListener(new n1(p82Var, (byte) 16));
                long V0 = i22Var.V0();
                k47 k47Var = yv1Var6 != null ? yv1Var6.F5 : null;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.id = 0;
                tL_message.out = true;
                tL_message.peer_id = oc7.r1(i15).x1(V0);
                tL_message.from_id = oc7.r1(i15).x1(z8c.h(i15).e());
                tL_message.flags2 |= TLObject.FLAG_13;
                TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
                tL_message.rich_message = richMessage;
                richMessage.blocks = V2;
                richMessage.photos = ch9Var.x2();
                tL_message.rich_message.documents = ch9Var.u2();
                if (k47Var != null && !k47Var.p) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_messageReplyHeader.flags |= 16;
                    tL_messageReplyHeader.reply_to_msg_id = k47Var.e1();
                    tL_message.reply_to = tL_messageReplyHeader;
                }
                k47 k47Var2 = new k47(i15, tL_message, false, false);
                if (k47Var != null && !k47Var.p) {
                    k47Var2.C = k47Var;
                }
                k47Var2.B0 = true;
                k47Var2.W2 = Boolean.TRUE;
                k47Var2.n0(null);
                k47Var2.w1 = true;
                p82Var.P.r(td4.u(k47Var2));
                xz1 sendButton = hh9Var.getSendButton();
                sendButton.setScaleX(1.0f);
                sendButton.setScaleY(1.0f);
                xz1 s = p82Var.P.s(sendButton, true, new k81(p82Var, (byte) 13));
                if (s != null) {
                    s.setBackground(new if9(cmb.b0(gm.L(22.0f), cmb.v0(cmb.Ei, ylbVar))));
                    j67 j67Var3 = p82Var.P;
                    int L = gm.L(44.0f);
                    j67Var3.p0 = true;
                    j67Var3.Y = L;
                }
                bu5 G3 = bu5.G(p82Var, ylbVar, sendButton);
                boolean z16 = yv1Var6 != null && m9c.D(yv1Var6.h());
                if (yv1Var6 != null && yv1Var6.M4()) {
                    G3.b(R.drawable.msg_calendar2, jb6.M0(z16 ? 2131745248 : 2131745593, null), new fu((Object) p82Var, V0, (byte) 8), false);
                    if (!z16 && V0 > 0) {
                        G3.b(R.drawable.msg_online, jb6.M0(2131745320, null), new e82(p82Var, r15 == true ? (byte) 1 : (byte) 0), false);
                    }
                }
                if (!z16) {
                    G3.b(R.drawable.input_notify_off, jb6.M0(2131745317, null), new e82(p82Var, (byte) 1), false);
                }
                G3.Z();
                p82Var.P.q(G3);
                p82Var.P.show();
                try {
                    view.performHapticFeedback(3, 2);
                } catch (Exception unused3) {
                }
                return true;
            case 15:
                vz9 vz9Var = (vz9) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, null, vz9Var.getContext());
                String M0 = jb6.M0(2131752007, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131752008, null);
                alertDialog$Builder.j(jb6.M0(2131752038, null), new ay9(vz9Var));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                heVar.Q0 = false;
                alertDialog$Builder.i(new qj8(vz9Var, (byte) 6));
                alertDialog$Builder.o();
                vz9Var.w(1.0f);
                try {
                    vz9Var.performHapticFeedback(0, 1);
                } catch (Exception unused4) {
                }
                return true;
            case 16:
                return a(view);
            case 17:
                tha thaVar = (tha) obj;
                if (thaVar.d == null) {
                    return false;
                }
                int intValue = ((Integer) view.getTag()).intValue();
                qha qhaVar = thaVar.d;
                int i16 = thaVar.c[intValue];
                k47 k47Var3 = thaVar.b[intValue];
                sz4 sz4Var = (sz4) qhaVar;
                ch4 ch4Var = ((ah4) sz4Var.a).d;
                if (ch4Var.p0.u()) {
                    ch4 ch4Var2 = ((ah4) sz4Var.a).d;
                    SpannableStringBuilder[] spannableStringBuilderArr = ch4.t0;
                    ch4Var2.e(i16, thaVar, k47Var3, intValue);
                } else {
                    ch4Var.f(k47Var3, thaVar, intValue);
                }
                return true;
            case 18:
                v9b v9bVar = (v9b) obj;
                Activity activity = v9bVar.b;
                a9b a9bVar = v9bVar.C0;
                if (a9bVar == null || !a9bVar.isFrontface()) {
                    return false;
                }
                v9bVar.m();
                v9bVar.F0.setSelected(true);
                v9bVar.s.e(0.85f, 240L, null);
                ?? G4 = bu5.G(v9bVar.r, v9bVar.a, v9bVar.F0);
                mla mlaVar = new mla(activity, 1);
                mlaVar.c(v9bVar.s.o);
                mlaVar.h = new g8b(v9bVar, r15 == true ? (byte) 1 : (byte) 0);
                G4.p(mlaVar);
                G4.n(true);
                mla mlaVar2 = new mla(activity, 2);
                mlaVar2.b = 0.65f;
                mlaVar2.c = 1.0f;
                mlaVar2.c(v9bVar.s.p);
                mlaVar2.h = new g8b(v9bVar, b3);
                G4.p(mlaVar2);
                G4.p = new f8b(v9bVar, b3);
                G4.s = (short) 0;
                G4.W(5);
                G4.b0(gm.L(46.0f), -gm.L(4.0f));
                G4.Q(-1155851493);
                G4.a0();
                return true;
            default:
                lambda$show$8 = VideoAds.lambda$show$8((TLRPC.TL_sponsoredMessage) obj, view);
                return lambda$show$8;
        }
    }
}
