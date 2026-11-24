// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ee implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ee(spc spcVar, Context context, int i, wjb wjbVar, y60 y60Var) {
        this.a = (byte) 3;
        this.c = spcVar;
        this.d = context;
        this.e = wjbVar;
        this.b = y60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        float f;
        TL_stars.SavedStarGift savedStarGift;
        float f2;
        byte b = 9;
        byte b2 = 17;
        byte b3 = 2;
        int i = -1;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.c;
                vi viVar = (vi) this.d;
                gj gjVar = (gj) this.e;
                i4d i4dVar = (i4d) this.b;
                gjVar.s(iArr[viVar.getValue()] * 60, 0, true);
                ((fx0) i4dVar.a).y0.run();
                break;
            case 1:
                si siVar = (si) this.c;
                ti tiVar = (ti) this.d;
                kr8 kr8Var = (kr8) this.e;
                i4d i4dVar2 = (i4d) this.b;
                kr8Var.a.m0(siVar.getValue() + 1, (tiVar.getValue() + 1) * 60, kr8Var.b);
                ((fx0) i4dVar2.a).y0.run();
                break;
            case 2:
                int[] iArr2 = (int[]) this.c;
                pi piVar = (pi) this.d;
                gj gjVar2 = (gj) this.e;
                i4d i4dVar3 = (i4d) this.b;
                gjVar2.s(iArr2[piVar.getValue()], 0, true);
                ((fx0) i4dVar3.a).y0.run();
                break;
            case 3:
                spc spcVar = (spc) this.c;
                Context context = (Context) this.d;
                wjb wjbVar = (wjb) this.e;
                y60 y60Var = (y60) this.b;
                spcVar.o();
                ij.k(context, wjbVar, new l0(y60Var, (byte) 25));
                break;
            case 4:
                no0 no0Var = (no0) this.c;
                mu1 mu1Var = (mu1) this.d;
                k27 k27Var = (k27) this.e;
                String str = (String) this.b;
                mu1Var.O9(k27Var, false, false);
                d01.s(no0Var.getContext(), Uri.parse(str), true, false, false, null, null, false, na7.q1(y6c.t0).k4.A2.f, false, false);
                break;
            case 5:
                String[] strArr = (String[]) this.c;
                ft0 ft0Var = (ft0) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                u41 u41Var = (u41) this.b;
                strArr[0] = ft0Var.a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    et0 et0Var = (et0) obj;
                    et0Var.b.a(TextUtils.equals(et0Var.a, strArr[0]), true);
                }
                u41Var.setEnabled(strArr[0] != null);
                break;
            case 6:
                boolean[] zArr = (boolean[]) this.c;
                yt0 yt0Var = (yt0) this.d;
                String[] strArr2 = (String[]) this.e;
                fx0 fx0Var = (fx0) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    yt0Var.a(strArr2[0]);
                }
                fx0Var.dismiss();
                break;
            case 7:
                fx0 fx0Var2 = (fx0) this.c;
                wjb wjbVar2 = (wjb) this.d;
                ImageView imageView = (ImageView) this.e;
                qt qtVar = (qt) this.b;
                cs5 G = cs5.G(fx0Var2.c, wjbVar2, imageView);
                G.b(R.drawable.menu_link_revoke, k96.M0(2131749285, null), qtVar, false);
                G.b0 = true;
                G.b0(0.0f, -gl.L(6.0f));
                G.s = (short) 0;
                G.a0();
                break;
            case 8:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                k37 k37Var = (k37) this.e;
                j47 j47Var = (j47) this.b;
                int i3 = ChatActivityEnterView.r7;
                chatActivityEnterView.N6 = !chatActivityEnterView.N6;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    ((k27) arrayList2.get(i4)).k.invert_media = chatActivityEnterView.N6;
                }
                k37Var.a(!chatActivityEnterView.N6, true);
                if (!arrayList2.isEmpty()) {
                    j47Var.d((k27) arrayList2.get(0));
                }
                j47Var.n(!chatActivityEnterView.N6);
                break;
            case 9:
                ChatActivityEnterView chatActivityEnterView2 = (ChatActivityEnterView) this.c;
                f27 f27Var = (f27) this.d;
                k27 k27Var2 = (k27) this.e;
                j47 j47Var2 = (j47) this.b;
                int i5 = ChatActivityEnterView.r7;
                if (f27Var != null) {
                    ArrayList arrayList3 = f27Var.d;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayList3.get(i6);
                        i6++;
                        ((k27) obj2).k.invert_media = chatActivityEnterView2.N6;
                    }
                    f27Var.a();
                } else {
                    k27Var2.k.invert_media = chatActivityEnterView2.N6;
                }
                chatActivityEnterView2.t0();
                j47Var2.f(true);
                chatActivityEnterView2.N6 = false;
                break;
            case 10:
                x02 x02Var = (x02) this.c;
                Context context2 = (Context) this.d;
                a8 a8Var = (a8) this.e;
                wjb wjbVar3 = (wjb) this.b;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x02Var.d2;
                if (chatAttachAlertPhotoLayout != null) {
                    jva.j1(context2, chatAttachAlertPhotoLayout.getStarsPrice(), true, new ae2(x02Var, a8Var, b), wjbVar3);
                    break;
                }
                break;
            case 11:
                f36 f36Var = (f36) this.c;
                Context context3 = (Context) this.d;
                fx0 fx0Var3 = (fx0) this.e;
                d dVar = (d) this.b;
                float[] fArr = f36Var.J;
                FrameLayout frameLayout = f36Var.n;
                if (f36Var.s == null) {
                    ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(context3, null);
                    if (!f36Var.y && f36Var.H) {
                        a8 a8Var2 = new a8(context3, true, false);
                        a8Var2.j(k96.M0(2131751323, null), R.drawable.msg_edit, null);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var2, nme.o(-1, 48));
                        a8Var2.setOnClickListener(new z26(f36Var, b4));
                    }
                    a8 a8Var3 = new a8(context3, true, false);
                    a8Var3.j(k96.M0(2131750456, null), R.drawable.msg_qrcode, null);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var3, nme.o(-1, 48));
                    a8Var3.setOnClickListener(new z26(f36Var, b3));
                    if (!f36Var.G) {
                        a8 a8Var4 = new a8(context3, false, true);
                        a8Var4.j(k96.M0(2131745830, null), R.drawable.msg_delete, null);
                        int i7 = bkb.o7;
                        a8Var4.d(bkb.w0(null, i7, false), bkb.w0(null, i7, false));
                        a8Var4.setOnClickListener(new z26(f36Var, (byte) 3));
                        actionBarPopupWindow$ActionBarPopupWindowLayout.a(a8Var4, nme.o(-1, 48));
                    }
                    FrameLayout overlayContainerView = fx0Var3 == null ? dVar.getParentLayout().getOverlayContainerView() : fx0Var3.c;
                    if (overlayContainerView != null) {
                        f36.a(frameLayout, overlayContainerView, fArr);
                        float f3 = fArr[1];
                        s71 s71Var = new s71(f36Var, context3, overlayContainerView, (byte) 13);
                        fb fbVar = new fb(s71Var, (byte) 6);
                        overlayContainerView.getViewTreeObserver().addOnPreDrawListener(fbVar);
                        overlayContainerView.addView(s71Var, nme.c(-1.0f, -1));
                        s71Var.setAlpha(0.0f);
                        s71Var.animate().alpha(1.0f).setDuration(150L);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.measure(View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredWidth(), 0), View.MeasureSpec.makeMeasureSpec(overlayContainerView.getMeasuredHeight(), 0));
                        m8 m8Var = new m8(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
                        f36Var.s = m8Var;
                        m8Var.setOnDismissListener(new dc4(f36Var, s71Var, overlayContainerView, fbVar, (byte) 1));
                        f36Var.s.setOutsideTouchable(true);
                        f36Var.s.setFocusable(true);
                        f36Var.s.setBackgroundDrawable(new ColorDrawable(0));
                        f36Var.s.setAnimationStyle(R.style.PopupContextAnimation);
                        f36Var.s.setInputMethodMode(2);
                        f36Var.s.setSoftInputMode(0);
                        actionBarPopupWindow$ActionBarPopupWindowLayout.setDispatchKeyEventListener(new y26(f36Var, b3));
                        if (gl.O1()) {
                            f3 += overlayContainerView.getPaddingTop();
                            f = 0.0f - overlayContainerView.getPaddingLeft();
                        } else {
                            f = 0.0f;
                        }
                        f36Var.s.showAtLocation(overlayContainerView, 0, (int) (overlayContainerView.getX() + ((overlayContainerView.getMeasuredWidth() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredWidth()) - gl.L(16.0f)) + f), (int) (overlayContainerView.getY() + f3 + frameLayout.getMeasuredHeight()));
                        break;
                    }
                }
                break;
            case 12:
                ve6 ve6Var = (ve6) this.c;
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                String str4 = (String) this.b;
                cs5 I = cs5.I(ve6Var.w, ve6Var.a);
                I.b(R.drawable.msg_help, k96.M0(2131745287, null), new e45(ve6Var, str2, str3, str4, (byte) 19), false);
                I.W(5);
                I.a0();
                break;
            case 13:
                s28 s28Var = (s28) this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
                m8b m8bVar = (m8b) this.e;
                TLRPC.Chat chat = (TLRPC.Chat) this.b;
                y28 y28Var = s28Var.x;
                s28 s28Var2 = y28Var.j1;
                if (s28Var2 != null) {
                    s28Var2.a();
                }
                storyItem.dialogId = y28Var.r1;
                storyItem.messageId = storyItem.id;
                k27 k27Var3 = new k27(y28Var.s2, storyItem);
                k27Var3.r0(false);
                m8bVar.L(new r28(chat.id, k27Var3, false));
                break;
            case 14:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                TLRPC.EmojiStatus emojiStatus = (TLRPC.EmojiStatus) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                zr1 zr1Var = (zr1) this.b;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.J2(emojiStatus, user, zr1Var);
                break;
            case 15:
                sq8 sq8Var = (sq8) this.c;
                xsa xsaVar = (xsa) this.d;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) this.e;
                h8c h8cVar = (h8c) this.b;
                ArrayList i8 = xsaVar.i();
                int i9 = 0;
                while (true) {
                    if (i9 >= i8.size()) {
                        savedStarGift = null;
                    } else if (((TL_stars.SavedStarGift) i8.get(i9)).gift.id == sq8Var.l1) {
                        savedStarGift = (TL_stars.SavedStarGift) i8.get(i9);
                        i = i9;
                    } else {
                        i9++;
                    }
                }
                if (savedStarGift != null) {
                    savedStarGift.pinned_to_top = false;
                    i8.set(i, savedStarGift2);
                    savedStarGift2.pinned_to_top = true;
                    ArrayList arrayList4 = xsaVar.l;
                    arrayList4.removeAll(i8);
                    if (xsaVar.e && !xsaVar.c) {
                        Collections.sort(arrayList4, new fx7((byte) 29));
                    }
                    arrayList4.addAll(0, i8);
                    kk7.f(xsaVar.a).k(kk7.H3, Long.valueOf(xsaVar.b), xsaVar);
                    xsaVar.p();
                    sq8Var.dismiss();
                    ((u21) h8cVar.run()).I(R.raw.ic_pin, k96.a0(null, null, 2131750015, vqa.t1(savedStarGift2.gift)), k96.a0(null, null, 2131750016, vqa.t1(savedStarGift.gift))).j();
                    break;
                }
                break;
            case 16:
                cb9 cb9Var = (cb9) this.c;
                x0 x0Var = (x0) this.d;
                cs5 H = cs5.H(cb9Var.c, (wjb) this.e, (ImageView) this.b, true);
                H.W(5);
                H.t = false;
                H.b0(gl.L(12.0f), gl.L(-32.0f));
                x0Var.a(H);
                break;
            case 17:
                ((VideoAds) this.c).lambda$show$7((cs5) this.d, (TLRPC.TL_sponsoredMessage) this.e, (Context) this.b, view);
                break;
            case 18:
                Activity activity = (Activity) this.c;
                wjb wjbVar4 = (wjb) this.d;
                mhc mhcVar = (mhc) this.e;
                fx0 fx0Var4 = (fx0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar4, activity);
                alertDialog$Builder.a.S = k96.M0(2131742895, null);
                alertDialog$Builder.a.U = k96.M0(2131742896, null);
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new cwb(mhcVar, fx0Var4, b));
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
            case 19:
                u41 u41Var2 = (u41) this.c;
                p8c p8cVar = (p8c) this.d;
                fx0 fx0Var5 = (fx0) this.e;
                wjb wjbVar5 = (wjb) this.b;
                u41Var2.setLoading(true);
                p8cVar.a(new ukc(u41Var2, fx0Var5, wjbVar5, b4));
                break;
            case 20:
                xoc xocVar = (xoc) this.c;
                wjb wjbVar6 = (wjb) this.d;
                Runnable runnable = (Runnable) this.e;
                Runnable runnable2 = (Runnable) this.b;
                wjb wjbVar7 = xocVar.a;
                if (!TextUtils.isEmpty(xocVar.s) && xocVar.r != null) {
                    hd[] hdVarArr = new hd[1];
                    LinearLayout linearLayout = new LinearLayout(xocVar.getContext());
                    linearLayout.setOrientation(1);
                    linearLayout.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
                    TLRPC.User user2 = xocVar.r;
                    if (user2 != null) {
                        String l = l7c.l(user2);
                        f2 = 4.0f;
                        LinearLayout linearLayout2 = new LinearLayout(xocVar.getContext());
                        linearLayout2.setOrientation(0);
                        linearLayout2.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                        be0 be0Var = new be0(xocVar.getContext());
                        be0Var.setRoundRadius(gl.L(15.0f));
                        pb0 pb0Var = new pb0((wjb) null);
                        pb0Var.q(xocVar.r);
                        be0Var.f(xocVar.r, pb0Var);
                        linearLayout2.addView(be0Var, nme.r(30, 30, 16));
                        TextView textView = new TextView(xocVar.getContext());
                        int i10 = bkb.F6;
                        zkb.X(textView, i10, wjbVar6);
                        textView.setTextSize(1, 20.0f);
                        textView.setText(k96.a0(null, null, 2131742701, l));
                        textView.setTypeface(gl.o());
                        textView.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                        linearLayout2.addView(textView, nme.t(-1, -2, 16, 9, 0, 0, 0));
                        linearLayout.addView(linearLayout2, nme.r(-1, -2, 55));
                        l46 l46Var = new l46(xocVar.getContext(), null);
                        zkb.X(l46Var, i10, wjbVar6);
                        zkb.G(l46Var, bkb.Wc, wjbVar6);
                        l46Var.setTextSize(1, 16.0f);
                        l46Var.setPadding(gl.L(4.0f), 0, gl.L(4.0f), 0);
                        l46Var.setText(gl.N2(k96.a0(null, null, 2131742956, l7c.r(xocVar.r)), -1, 0, new mhc(hdVarArr, runnable, (byte) 24), null));
                        linearLayout.addView(l46Var, nme.t(-1, -2, 55, 0, 14, 0, 0));
                    } else {
                        f2 = 4.0f;
                    }
                    FrameLayout frameLayout2 = new FrameLayout(xocVar.getContext());
                    frameLayout2.setPadding(gl.L(f2), 0, gl.L(f2), 0);
                    TextView textView2 = new TextView(xocVar.getContext());
                    textView2.setTextSize(1, 14.0f);
                    zkb.X(textView2, bkb.F6, wjbVar6);
                    textView2.setText(noc.Z(xocVar.s));
                    textView2.setPadding(gl.L(10.0f), gl.L(12.0f), gl.L(10.0f), gl.L(12.0f));
                    textView2.setTypeface(gl.n1("fonts/rmono.ttf"));
                    int i11 = bkb.Z6;
                    int v0 = bkb.v0(i11, wjbVar7);
                    int v02 = bkb.v0(i11, wjbVar7);
                    int i12 = bkb.h6;
                    ff0 Z = bkb.Z(v0, bkb.v(v02, bkb.v0(i12, wjbVar7)), 10, 10);
                    vkb M = zkb.M(i11);
                    vkb p = zkb.p(i11, i12);
                    textView2.setBackground(Z);
                    zkb.j(textView2, Z, M, p, wjbVar6);
                    textView2.setGravity(17);
                    frameLayout2.addView(textView2, nme.d(-1, -2.0f, 7, 0.0f, 0.0f, 0.0f, 0.0f));
                    linearLayout.addView(frameLayout2, nme.t(-1, -2, 55, 0, 14, 0, 0));
                    ote.b(textView2, 0.02f, 1.2f);
                    textView2.setOnClickListener(new hu4(xocVar, hdVarArr, runnable2, (byte) 27));
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wjbVar6, xocVar.getContext());
                    alertDialog$Builder2.n(linearLayout);
                    alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                    hdVarArr[0] = alertDialog$Builder2.o();
                    break;
                }
                break;
            default:
                u41 u41Var3 = (u41) this.c;
                nu9 nu9Var = (nu9) this.d;
                cj7 cj7Var = (cj7) this.e;
                wjb wjbVar8 = (wjb) this.b;
                if (!u41Var3.R) {
                    u41Var3.setLoading(true);
                    nu9Var.a(new f28(u41Var3, cj7Var, wjbVar8, b2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ee(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }
}
