// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class d68 extends my0 {
    public static final /* synthetic */ int I1 = 0;
    public final int A1;
    public final int B1;
    public final int C1;
    public final boolean D1;
    public n32 E1;
    public final ArrayList F1;
    public final ArrayList G1;
    public final TLRPC.TL_userContact_old2 H1;
    public final lj4 l1;
    public final w58 m1;
    public final LinearLayout n1;
    public final x58 o1;
    public final View p1;
    public final View q1;
    public final TextView r1;
    public final d s1;
    public boolean t1;
    public final Paint u1;
    public int v1;
    public AnimatorSet w1;
    public AnimatorSet x1;
    public final int y1;
    public final int z1;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d68(d dVar, yv2 yv2Var, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final ylb ylbVar) {
        super(1, ylbVar, (Context) dVar.getParentActivity(), false);
        ArrayList c2;
        ArrayList<TLRPC.RestrictionReason> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i;
        final int i2;
        this.u1 = new Paint(1);
        this.F1 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        this.G1 = arrayList4;
        String str4 = str2;
        String str5 = str3;
        String m = bw2.m(0, str4, str5);
        ArrayList arrayList5 = new ArrayList();
        if (uri != null) {
            c2 = gm.c2(uri, this.a, false, arrayList5, m);
        } else if (file != null) {
            c2 = gm.c2(Uri.fromFile(file), this.a, false, arrayList5, m);
            file.delete();
            this.D1 = true;
        } else {
            if (str != null) {
                fm fmVar = new fm();
                fmVar.c = 0;
                String concat = "TEL;MOBILE:+".concat(str);
                fmVar.b = concat;
                fmVar.a.add(concat);
                arrayList4.add(fmVar);
                this.D1 = true;
            } else {
                String str6 = yv2Var.b;
                if (str6 != null) {
                    c2 = gm.c2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.a, true, arrayList5, m);
                } else {
                    fm fmVar2 = new fm();
                    fmVar2.c = 0;
                    String str7 = "TEL;MOBILE:+" + yv2Var.m.phone;
                    fmVar2.b = str7;
                    fmVar2.a.add(str7);
                    arrayList4.add(fmVar2);
                }
            }
            c2 = null;
        }
        TLRPC.User user2 = (user != null || yv2Var == null) ? user : yv2Var.m;
        if (c2 != null) {
            for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                fm fmVar3 = (fm) arrayList5.get(i3);
                if (fmVar3.c == 0) {
                    int i4 = 0;
                    while (true) {
                        int size = this.G1.size();
                        ArrayList arrayList6 = this.G1;
                        if (i4 >= size) {
                            arrayList6.add(fmVar3);
                            break;
                        } else {
                            if (((fm) arrayList6.get(i4)).c(false).equals(fmVar3.c(false))) {
                                fmVar3.d = false;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    this.F1.add(fmVar3);
                }
            }
            if (!c2.isEmpty()) {
                TLRPC.User user3 = (TLRPC.User) c2.get(0);
                arrayList = user3.restriction_reason;
                if (TextUtils.isEmpty(str4)) {
                    String str8 = user3.first_name;
                    str5 = user3.last_name;
                    str4 = str8;
                }
                TLRPC.TL_userContact_old2 tL_userContact_old2 = new TLRPC.TL_userContact_old2();
                this.H1 = tL_userContact_old2;
                if (user2 == null) {
                    tL_userContact_old2.id = user2.id;
                    tL_userContact_old2.access_hash = user2.access_hash;
                    tL_userContact_old2.photo = user2.photo;
                    tL_userContact_old2.status = user2.status;
                    tL_userContact_old2.first_name = user2.first_name;
                    tL_userContact_old2.last_name = user2.last_name;
                    tL_userContact_old2.phone = user2.phone;
                    if (arrayList != null) {
                        tL_userContact_old2.restriction_reason = arrayList;
                    }
                } else {
                    tL_userContact_old2.first_name = str4;
                    tL_userContact_old2.last_name = str5;
                }
                this.s1 = dVar;
                final Activity parentActivity = dVar.getParentActivity();
                arrayList2 = this.F1;
                this.y1 = 1;
                arrayList3 = this.G1;
                if (arrayList3.size() <= 1 || !arrayList2.isEmpty()) {
                    if (arrayList3.isEmpty()) {
                        int i5 = this.y1;
                        this.z1 = i5;
                        int size2 = arrayList3.size() + i5;
                        this.y1 = size2;
                        this.A1 = size2;
                    } else {
                        this.z1 = -1;
                        this.A1 = -1;
                    }
                    if (arrayList2.isEmpty()) {
                        int i6 = this.y1;
                        this.B1 = i6;
                        int size3 = arrayList2.size() + i6;
                        this.y1 = size3;
                        this.C1 = size3;
                    } else {
                        this.B1 = -1;
                        this.C1 = -1;
                    }
                } else {
                    this.z1 = -1;
                    this.A1 = -1;
                    this.B1 = -1;
                    this.C1 = -1;
                }
                v58 v58Var = new v58(this, parentActivity, parentActivity);
                v58Var.setWillNotDraw(false);
                this.b = v58Var;
                this.v0 = false;
                this.w0 = false;
                this.l1 = new lj4(this);
                w58 w58Var = new w58(this, parentActivity);
                this.m1 = w58Var;
                w58Var.setClipToPadding(false);
                w58Var.setVerticalScrollBarEnabled(false);
                v58Var.addView(w58Var, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                this.n1 = linearLayout;
                linearLayout.setOrientation(1);
                w58Var.addView(linearLayout, qoe.x(-1, -1, 51));
                w58Var.setOnScrollChangeListener(new t58(this));
                i = this.y1;
                for (i2 = 0; i2 < i; i2++) {
                    ViewGroup k = this.l1.k(parentActivity, i2);
                    this.n1.addView(k, qoe.o(-1, -2));
                    if ((i2 >= this.z1 && i2 < this.A1) || (i2 >= this.B1 && i2 < this.C1)) {
                        k.setBackgroundDrawable(cmb.L0(false));
                        k.setOnClickListener(new wh((Object) this, i2, (Object) k, (byte) 12));
                        k.setOnLongClickListener(new View.OnLongClickListener() { // from class: u58
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                fm fmVar4;
                                d68 d68Var = d68.this;
                                int i7 = i2;
                                ylb ylbVar2 = ylbVar;
                                Activity activity = parentActivity;
                                int i8 = d68Var.z1;
                                if (i7 < i8 || i7 >= d68Var.A1) {
                                    int i9 = d68Var.B1;
                                    fmVar4 = (i7 < i9 || i7 >= d68Var.C1) ? null : (fm) d68Var.F1.get(i7 - i9);
                                } else {
                                    fmVar4 = (fm) d68Var.G1.get(i7 - i8);
                                }
                                if (fmVar4 == null) {
                                    return false;
                                }
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fmVar4.c(false)));
                                if (c41.a(d68Var.s1)) {
                                    if (fmVar4.c == 3) {
                                        new c41((FrameLayout) d68Var.b, ylbVar2).k(false).j();
                                        return true;
                                    }
                                    m31 m31Var = new m31(activity, ylbVar2);
                                    int i10 = fmVar4.c;
                                    l66 l66Var = m31Var.b;
                                    if (i10 == 0) {
                                        l66Var.setText(jb6.M0(2131747028, null));
                                        m31Var.a.setImageResource(R.drawable.msg_calls);
                                    } else if (i10 == 1) {
                                        l66Var.setText(jb6.M0(2131751140, null));
                                        m31Var.a.setImageResource(R.drawable.msg_mention);
                                    } else {
                                        l66Var.setText(jb6.M0(2131743879, null));
                                        m31Var.a.setImageResource(R.drawable.msg_info);
                                    }
                                    if (gm.C3()) {
                                        u31.f((FrameLayout) d68Var.b, m31Var, 1500).j();
                                    }
                                }
                                return true;
                            }
                        });
                    }
                }
                x58 x58Var = new x58(this, parentActivity);
                this.o1 = x58Var;
                anb.h(cmb.g5, ylbVar, x58Var);
                x58Var.setBackButtonImage(R.drawable.ic_ab_back);
                int i7 = cmb.i5;
                anb.l(x58Var, 1, i7, ylbVar);
                anb.l(x58Var, 3, cmb.H5, ylbVar);
                anb.l(x58Var, 5, i7, ylbVar);
                x58Var.setOccupyStatusBar(false);
                x58Var.setAlpha(0.0f);
                if (this.D1) {
                    x58Var.setTitle(jb6.M0(2131745194, null));
                } else {
                    x58Var.setTitle(jb6.M0(2131754446, null));
                }
                this.b.addView(x58Var, qoe.c(-2.0f, -1));
                x58Var.setActionBarMenuOnItemClick(new y58(this));
                View view = new View(parentActivity);
                this.p1 = view;
                view.setAlpha(0.0f);
                int i8 = cmb.U5;
                anb.h(i8, ylbVar, view);
                this.b.addView(view, qoe.c(1.0f, -1));
                View view2 = new View(parentActivity);
                this.q1 = view2;
                anb.h(i8, ylbVar, view2);
                view2.setAlpha(0.0f);
                this.b.addView(view2, qoe.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                TextView textView = new TextView(parentActivity);
                this.r1 = textView;
                textView.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
                byte b = 17;
                textView.setGravity(17);
                textView.setTextColor(cmb.v0(cmb.Ii, this.J0));
                textView.setTextSize(1, 14.0f);
                if (this.D1) {
                    textView.setText(jb6.M0(2131745194, null));
                } else {
                    textView.setText(jb6.M0(2131754446, null));
                }
                textView.setTypeface(gm.o());
                int L = gm.L(8.0f);
                int i9 = cmb.Ei;
                int v0 = cmb.v0(i9, this.J0);
                int i10 = cmb.Gi;
                int v02 = cmb.v0(i10, this.J0);
                fg0 i0 = cmb.i0(L, L, L, L, v0, v02, v02);
                wmb M = anb.M(i9);
                wmb M2 = anb.M(i10);
                textView.setBackground(i0);
                anb.j(textView, i0, M, M2, ylbVar);
                v58Var.addView(textView, qoe.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                textView.setOnClickListener(new n06(this, ylbVar, b));
            }
        }
        arrayList = null;
        TLRPC.TL_userContact_old2 tL_userContact_old22 = new TLRPC.TL_userContact_old2();
        this.H1 = tL_userContact_old22;
        if (user2 == null) {
        }
        this.s1 = dVar;
        final Activity parentActivity2 = dVar.getParentActivity();
        arrayList2 = this.F1;
        this.y1 = 1;
        arrayList3 = this.G1;
        if (arrayList3.size() <= 1) {
        }
        if (arrayList3.isEmpty()) {
        }
        if (arrayList2.isEmpty()) {
        }
        v58 v58Var2 = new v58(this, parentActivity2, parentActivity2);
        v58Var2.setWillNotDraw(false);
        this.b = v58Var2;
        this.v0 = false;
        this.w0 = false;
        this.l1 = new lj4(this);
        w58 w58Var2 = new w58(this, parentActivity2);
        this.m1 = w58Var2;
        w58Var2.setClipToPadding(false);
        w58Var2.setVerticalScrollBarEnabled(false);
        v58Var2.addView(w58Var2, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.n1 = linearLayout2;
        linearLayout2.setOrientation(1);
        w58Var2.addView(linearLayout2, qoe.x(-1, -1, 51));
        w58Var2.setOnScrollChangeListener(new t58(this));
        i = this.y1;
        while (i2 < i) {
        }
        x58 x58Var2 = new x58(this, parentActivity2);
        this.o1 = x58Var2;
        anb.h(cmb.g5, ylbVar, x58Var2);
        x58Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i72 = cmb.i5;
        anb.l(x58Var2, 1, i72, ylbVar);
        anb.l(x58Var2, 3, cmb.H5, ylbVar);
        anb.l(x58Var2, 5, i72, ylbVar);
        x58Var2.setOccupyStatusBar(false);
        x58Var2.setAlpha(0.0f);
        if (this.D1) {
        }
        this.b.addView(x58Var2, qoe.c(-2.0f, -1));
        x58Var2.setActionBarMenuOnItemClick(new y58(this));
        View view3 = new View(parentActivity2);
        this.p1 = view3;
        view3.setAlpha(0.0f);
        int i82 = cmb.U5;
        anb.h(i82, ylbVar, view3);
        this.b.addView(view3, qoe.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.q1 = view22;
        anb.h(i82, ylbVar, view22);
        view22.setAlpha(0.0f);
        this.b.addView(view22, qoe.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.r1 = textView2;
        textView2.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        byte b2 = 17;
        textView2.setGravity(17);
        textView2.setTextColor(cmb.v0(cmb.Ii, this.J0));
        textView2.setTextSize(1, 14.0f);
        if (this.D1) {
        }
        textView2.setTypeface(gm.o());
        int L2 = gm.L(8.0f);
        int i92 = cmb.Ei;
        int v03 = cmb.v0(i92, this.J0);
        int i102 = cmb.Gi;
        int v022 = cmb.v0(i102, this.J0);
        fg0 i02 = cmb.i0(L2, L2, L2, L2, v03, v022, v022);
        wmb M3 = anb.M(i92);
        wmb M22 = anb.M(i102);
        textView2.setBackground(i02);
        anb.j(textView2, i02, M3, M22, ylbVar);
        v58Var2.addView(textView2, qoe.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new n06(this, ylbVar, b2));
    }

    @Override // my0
    public final boolean C() {
        return false;
    }

    public final void D0() {
        TextView textView = this.r1;
        if (textView != null) {
            int v0 = cmb.v0(cmb.Ii, this.J0);
            if (!textView.isEnabled()) {
                v0 &= ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            if (textView.getCurrentTextColor() != v0) {
                textView.setTextColor(v0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E0(boolean z) {
        Integer num;
        AnimatorSet animatorSet;
        Integer num2 = 1;
        w58 w58Var = this.m1;
        View childAt = w58Var.getChildAt(0);
        int top = childAt.getTop() - w58Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z2 = top <= 0;
        x58 x58Var = this.o1;
        Object tag = x58Var.getTag();
        if (z2) {
            if (tag == null) {
                num = num2;
                x58Var.setTag(num);
                animatorSet = this.w1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.w1 = null;
                }
                View view = this.p1;
                if (z) {
                    x58Var.setAlpha(z2 ? 1.0f : 0.0f);
                    view.setAlpha(z2 ? 1.0f : 0.0f);
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.w1 = animatorSet2;
                    animatorSet2.setDuration(180L);
                    AnimatorSet animatorSet3 = this.w1;
                    Property property = View.ALPHA;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(x58Var, (Property<x58, Float>) property, z2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z2 ? 1.0f : 0.0f));
                    this.w1.addListener(new a68(this, (byte) 0));
                    this.w1.start();
                }
            }
        } else if (tag != null) {
            num = null;
            x58Var.setTag(num);
            animatorSet = this.w1;
            if (animatorSet != null) {
            }
            View view2 = this.p1;
            if (z) {
            }
        }
        if (this.v1 != top) {
            this.v1 = top;
            this.b.invalidate();
        }
        childAt.getBottom();
        w58Var.getMeasuredHeight();
        boolean z3 = childAt.getBottom() - w58Var.getScrollY() > w58Var.getMeasuredHeight();
        View view3 = this.q1;
        if (z3) {
            if (view3.getTag() != null) {
                return;
            }
        } else if (view3.getTag() == null) {
            return;
        } else {
            num2 = null;
        }
        view3.setTag(num2);
        AnimatorSet animatorSet4 = this.x1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
            this.x1 = null;
        }
        if (!z) {
            view3.setAlpha(z3 ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.x1 = animatorSet5;
        animatorSet5.setDuration(180L);
        this.x1.playTogether(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, z3 ? 1.0f : 0.0f));
        this.x1.addListener(new a68(this, (byte) 1));
        this.x1.start();
    }

    @Override // my0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        u31.a((FrameLayout) this.b, new oz((byte) 10));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        u31.h((FrameLayout) this.b);
    }

    @Override // my0
    public final void p0() {
        super.p0();
        try {
            D0();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
