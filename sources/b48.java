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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b48 extends fx0 {
    public static final /* synthetic */ int I1 = 0;
    public final int A1;
    public final int B1;
    public final int C1;
    public final boolean D1;
    public b22 E1;
    public final ArrayList F1;
    public final ArrayList G1;
    public final TLRPC.TL_userContact_old2 H1;
    public final gi3 l1;
    public final u38 m1;
    public final LinearLayout n1;
    public final v38 o1;
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
    public b48(d dVar, nu2 nu2Var, TLRPC.User user, Uri uri, File file, String str, String str2, String str3, final wjb wjbVar) {
        super(1, wjbVar, (Context) dVar.getParentActivity(), false);
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
        String m = qu2.m(0, str4, str5);
        ArrayList arrayList5 = new ArrayList();
        if (uri != null) {
            c2 = gl.c2(uri, this.a, false, arrayList5, m);
        } else if (file != null) {
            c2 = gl.c2(Uri.fromFile(file), this.a, false, arrayList5, m);
            file.delete();
            this.D1 = true;
        } else {
            if (str != null) {
                fl flVar = new fl();
                flVar.c = 0;
                String concat = "TEL;MOBILE:+".concat(str);
                flVar.b = concat;
                flVar.a.add(concat);
                arrayList4.add(flVar);
                this.D1 = true;
            } else {
                String str6 = nu2Var.b;
                if (str6 != null) {
                    c2 = gl.c2(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, str6), this.a, true, arrayList5, m);
                } else {
                    fl flVar2 = new fl();
                    flVar2.c = 0;
                    String str7 = "TEL;MOBILE:+" + nu2Var.m.phone;
                    flVar2.b = str7;
                    flVar2.a.add(str7);
                    arrayList4.add(flVar2);
                }
            }
            c2 = null;
        }
        TLRPC.User user2 = (user != null || nu2Var == null) ? user : nu2Var.m;
        if (c2 != null) {
            for (int i3 = 0; i3 < arrayList5.size(); i3++) {
                fl flVar3 = (fl) arrayList5.get(i3);
                if (flVar3.c == 0) {
                    int i4 = 0;
                    while (true) {
                        int size = this.G1.size();
                        ArrayList arrayList6 = this.G1;
                        if (i4 >= size) {
                            arrayList6.add(flVar3);
                            break;
                        } else {
                            if (((fl) arrayList6.get(i4)).c(false).equals(flVar3.c(false))) {
                                flVar3.d = false;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    this.F1.add(flVar3);
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
                t38 t38Var = new t38(this, parentActivity, parentActivity);
                t38Var.setWillNotDraw(false);
                this.b = t38Var;
                this.v0 = false;
                this.w0 = false;
                this.l1 = new gi3(this);
                u38 u38Var = new u38(this, parentActivity);
                this.m1 = u38Var;
                u38Var.setClipToPadding(false);
                u38Var.setVerticalScrollBarEnabled(false);
                t38Var.addView(u38Var, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
                LinearLayout linearLayout = new LinearLayout(parentActivity);
                this.n1 = linearLayout;
                linearLayout.setOrientation(1);
                u38Var.addView(linearLayout, nme.x(-1, -1, 51));
                u38Var.setOnScrollChangeListener(new r38(this));
                i = this.y1;
                for (i2 = 0; i2 < i; i2++) {
                    ViewGroup p = this.l1.p(parentActivity, i2);
                    this.n1.addView(p, nme.o(-1, -2));
                    if ((i2 >= this.z1 && i2 < this.A1) || (i2 >= this.B1 && i2 < this.C1)) {
                        p.setBackgroundDrawable(bkb.L0(false));
                        p.setOnClickListener(new wg((Object) this, i2, (Object) p, (byte) 12));
                        p.setOnLongClickListener(new View.OnLongClickListener() { // from class: s38
                            @Override // android.view.View.OnLongClickListener
                            public final boolean onLongClick(View view) {
                                fl flVar4;
                                b48 b48Var = b48.this;
                                int i7 = i2;
                                wjb wjbVar2 = wjbVar;
                                Activity activity = parentActivity;
                                int i8 = b48Var.z1;
                                if (i7 < i8 || i7 >= b48Var.A1) {
                                    int i9 = b48Var.B1;
                                    flVar4 = (i7 < i9 || i7 >= b48Var.C1) ? null : (fl) b48Var.F1.get(i7 - i9);
                                } else {
                                    flVar4 = (fl) b48Var.G1.get(i7 - i8);
                                }
                                if (flVar4 == null) {
                                    return false;
                                }
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", flVar4.c(false)));
                                if (u21.a(b48Var.s1)) {
                                    if (flVar4.c == 3) {
                                        new u21((FrameLayout) b48Var.b, wjbVar2).k(false).j();
                                        return true;
                                    }
                                    e21 e21Var = new e21(activity, wjbVar2);
                                    int i10 = flVar4.c;
                                    l46 l46Var = e21Var.b;
                                    if (i10 == 0) {
                                        l46Var.setText(k96.M0(2131747102, null));
                                        e21Var.a.setImageResource(R.drawable.msg_calls);
                                    } else if (i10 == 1) {
                                        l46Var.setText(k96.M0(2131751191, null));
                                        e21Var.a.setImageResource(R.drawable.msg_mention);
                                    } else {
                                        l46Var.setText(k96.M0(2131743953, null));
                                        e21Var.a.setImageResource(R.drawable.msg_info);
                                    }
                                    if (gl.C3()) {
                                        m21.f((FrameLayout) b48Var.b, e21Var, 1500).j();
                                    }
                                }
                                return true;
                            }
                        });
                    }
                }
                v38 v38Var = new v38(this, parentActivity);
                this.o1 = v38Var;
                zkb.h(bkb.g5, wjbVar, v38Var);
                v38Var.setBackButtonImage(R.drawable.ic_ab_back);
                int i7 = bkb.i5;
                zkb.l(v38Var, 1, i7, wjbVar);
                zkb.l(v38Var, 3, bkb.H5, wjbVar);
                zkb.l(v38Var, 5, i7, wjbVar);
                v38Var.setOccupyStatusBar(false);
                v38Var.setAlpha(0.0f);
                if (this.D1) {
                    v38Var.setTitle(k96.M0(2131745268, null));
                } else {
                    v38Var.setTitle(k96.M0(2131754446, null));
                }
                this.b.addView(v38Var, nme.c(-2.0f, -1));
                v38Var.setActionBarMenuOnItemClick(new w38(this));
                View view = new View(parentActivity);
                this.p1 = view;
                view.setAlpha(0.0f);
                int i8 = bkb.U5;
                zkb.h(i8, wjbVar, view);
                this.b.addView(view, nme.c(1.0f, -1));
                View view2 = new View(parentActivity);
                this.q1 = view2;
                zkb.h(i8, wjbVar, view2);
                view2.setAlpha(0.0f);
                this.b.addView(view2, nme.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
                TextView textView = new TextView(parentActivity);
                this.r1 = textView;
                textView.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
                textView.setGravity(17);
                textView.setTextColor(bkb.v0(bkb.Ii, this.J0));
                textView.setTextSize(1, 14.0f);
                if (this.D1) {
                    textView.setText(k96.M0(2131745268, null));
                } else {
                    textView.setText(k96.M0(2131754446, null));
                }
                textView.setTypeface(gl.o());
                int L = gl.L(8.0f);
                int i9 = bkb.Ei;
                int v0 = bkb.v0(i9, this.J0);
                int i10 = bkb.Gi;
                int v02 = bkb.v0(i10, this.J0);
                ff0 i0 = bkb.i0(L, L, L, L, v0, v02, v02);
                vkb M = zkb.M(i9);
                vkb M2 = zkb.M(i10);
                textView.setBackground(i0);
                zkb.j(textView, i0, M, M2, wjbVar);
                t38Var.addView(textView, nme.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
                textView.setOnClickListener(new v16(this, wjbVar, (byte) 16));
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
        t38 t38Var2 = new t38(this, parentActivity2, parentActivity2);
        t38Var2.setWillNotDraw(false);
        this.b = t38Var2;
        this.v0 = false;
        this.w0 = false;
        this.l1 = new gi3(this);
        u38 u38Var2 = new u38(this, parentActivity2);
        this.m1 = u38Var2;
        u38Var2.setClipToPadding(false);
        u38Var2.setVerticalScrollBarEnabled(false);
        t38Var2.addView(u38Var2, nme.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 77.0f));
        LinearLayout linearLayout2 = new LinearLayout(parentActivity2);
        this.n1 = linearLayout2;
        linearLayout2.setOrientation(1);
        u38Var2.addView(linearLayout2, nme.x(-1, -1, 51));
        u38Var2.setOnScrollChangeListener(new r38(this));
        i = this.y1;
        while (i2 < i) {
        }
        v38 v38Var2 = new v38(this, parentActivity2);
        this.o1 = v38Var2;
        zkb.h(bkb.g5, wjbVar, v38Var2);
        v38Var2.setBackButtonImage(R.drawable.ic_ab_back);
        int i72 = bkb.i5;
        zkb.l(v38Var2, 1, i72, wjbVar);
        zkb.l(v38Var2, 3, bkb.H5, wjbVar);
        zkb.l(v38Var2, 5, i72, wjbVar);
        v38Var2.setOccupyStatusBar(false);
        v38Var2.setAlpha(0.0f);
        if (this.D1) {
        }
        this.b.addView(v38Var2, nme.c(-2.0f, -1));
        v38Var2.setActionBarMenuOnItemClick(new w38(this));
        View view3 = new View(parentActivity2);
        this.p1 = view3;
        view3.setAlpha(0.0f);
        int i82 = bkb.U5;
        zkb.h(i82, wjbVar, view3);
        this.b.addView(view3, nme.c(1.0f, -1));
        View view22 = new View(parentActivity2);
        this.q1 = view22;
        zkb.h(i82, wjbVar, view22);
        view22.setAlpha(0.0f);
        this.b.addView(view22, nme.d(-1, 1.0f, 83, 0.0f, 0.0f, 0.0f, 77.0f));
        TextView textView2 = new TextView(parentActivity2);
        this.r1 = textView2;
        textView2.setPadding(gl.L(34.0f), 0, gl.L(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(bkb.v0(bkb.Ii, this.J0));
        textView2.setTextSize(1, 14.0f);
        if (this.D1) {
        }
        textView2.setTypeface(gl.o());
        int L2 = gl.L(8.0f);
        int i92 = bkb.Ei;
        int v03 = bkb.v0(i92, this.J0);
        int i102 = bkb.Gi;
        int v022 = bkb.v0(i102, this.J0);
        ff0 i02 = bkb.i0(L2, L2, L2, L2, v03, v022, v022);
        vkb M3 = zkb.M(i92);
        vkb M22 = zkb.M(i102);
        textView2.setBackground(i02);
        zkb.j(textView2, i02, M3, M22, wjbVar);
        t38Var2.addView(textView2, nme.d(-1, 48.0f, 83, 14.0f, 14.0f, 14.0f, 14.0f));
        textView2.setOnClickListener(new v16(this, wjbVar, (byte) 16));
    }

    @Override // fx0
    public final boolean D() {
        return false;
    }

    public final void D0() {
        TextView textView = this.r1;
        if (textView != null) {
            int v0 = bkb.v0(bkb.Ii, this.J0);
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
        u38 u38Var = this.m1;
        View childAt = u38Var.getChildAt(0);
        int top = childAt.getTop() - u38Var.getScrollY();
        if (top < 0) {
            top = 0;
        }
        boolean z2 = top <= 0;
        v38 v38Var = this.o1;
        Object tag = v38Var.getTag();
        if (z2) {
            if (tag == null) {
                num = num2;
                v38Var.setTag(num);
                animatorSet = this.w1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.w1 = null;
                }
                View view = this.p1;
                if (z) {
                    v38Var.setAlpha(z2 ? 1.0f : 0.0f);
                    view.setAlpha(z2 ? 1.0f : 0.0f);
                } else {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.w1 = animatorSet2;
                    animatorSet2.setDuration(180L);
                    AnimatorSet animatorSet3 = this.w1;
                    Property property = View.ALPHA;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(v38Var, (Property<v38, Float>) property, z2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) property, z2 ? 1.0f : 0.0f));
                    this.w1.addListener(new y38(this, (byte) 0));
                    this.w1.start();
                }
            }
        } else if (tag != null) {
            num = null;
            v38Var.setTag(num);
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
        u38Var.getMeasuredHeight();
        boolean z3 = childAt.getBottom() - u38Var.getScrollY() > u38Var.getMeasuredHeight();
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
        this.x1.addListener(new y38(this, (byte) 1));
        this.x1.start();
    }

    @Override // fx0, android.app.Dialog
    public final void onStart() {
        super.onStart();
        m21.a((FrameLayout) this.b, new oy((byte) 10));
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        m21.h((FrameLayout) this.b);
    }

    @Override // fx0
    public final void p0() {
        super.p0();
        try {
            D0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
