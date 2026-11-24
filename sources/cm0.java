// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class cm0 extends n7 {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public cm0(dm0 dm0Var) {
        this.a = (byte) 0;
        this.c = dm0Var;
        this.b = new oz(this, (byte) 13);
    }

    public static boolean n(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || de9.t(" ", lowerCase2, lowerCase) || de9.t(".", lowerCase2, lowerCase)) {
            return true;
        }
        String J3 = gl.J3(lowerCase);
        String J32 = gl.J3(lowerCase2);
        return J3.startsWith(J32) || J3.contains(" ".concat(J32)) || J3.contains(".".concat(J32));
    }

    @Override // n7
    public final boolean b() {
        switch (this.a) {
            case 3:
                ((u58) this.c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // n7
    public final void h() {
        byte b = this.a;
        Object obj = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                dm0 dm0Var = (dm0) obj;
                dm0Var.w = null;
                gl.r((oz) this.b);
                cb cbVar = dm0Var.f;
                if (cbVar != null) {
                    cbVar.c();
                    dm0Var.f = null;
                }
                va vaVar = dm0Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    dm0Var.a.f3.g1(0, 0);
                    break;
                }
                break;
            case 1:
                sr4 sr4Var = (sr4) obj;
                fu fuVar = sr4Var.d;
                w42 w42Var = sr4Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                w42Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(w42Var, (Property<w42, Float>) property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(w42Var, (Property<w42, Float>) property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w42Var, (Property<w42, Float>) property3, 1.0f));
                EditTextBoldCursor searchField = sr4Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
                }
                fuVar.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(fuVar, (Property<fu, Float>) property3, 1.0f));
                fuVar.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(sr4Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ir4(this, b2));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(s33.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new u5(this, searchField, (byte) 24));
                ((AnimatorSet) this.b).start();
                break;
            case 2:
                me5 me5Var = (me5) obj;
                me5Var.r = null;
                me5Var.n = false;
                gl.r((iu4) this.b);
                va vaVar2 = me5Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    me5Var.a.f3.g1(0, 0);
                }
                me5Var.y.d.setText(k96.M0(TextUtils.isEmpty(me5Var.r) ? 2131742655 : 2131742654, null));
                break;
        }
    }

    @Override // n7
    public final void i() {
        switch (this.a) {
            case 1:
                sr4 sr4Var = (sr4) this.c;
                fu fuVar = sr4Var.d;
                FrameLayout frameLayout = sr4Var.h;
                w42 w42Var = sr4Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                byte b = 0;
                arrayList.add(ObjectAnimator.ofFloat(w42Var, (Property<w42, Float>) property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(w42Var, (Property<w42, Float>) property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w42Var, (Property<w42, Float>) property3, 0.0f));
                EditTextBoldCursor searchField = sr4Var.H.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(fuVar, (Property<fu, Float>) property3, 0.0f));
                fuVar.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
                sr4Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ir4(this, b));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(s33.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new im2(this, (byte) 25));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // n7
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 3:
                ((u58) this.c).f0(editTextBoldCursor);
                break;
        }
    }

    @Override // n7
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                dm0 dm0Var = (dm0) obj;
                boolean z = !TextUtils.isEmpty(dm0Var.w);
                String obj2 = editTextBoldCursor.getText().toString();
                if (!TextUtils.equals(dm0Var.w, obj2)) {
                    dm0Var.w = obj2;
                    cb cbVar = dm0Var.f;
                    if (cbVar != null) {
                        cbVar.c();
                    }
                    i = ((d) dm0Var).currentAccount;
                    cb cbVar2 = new cb(obj2, i, new zl0(dm0Var, (byte) 1));
                    dm0Var.f = cbVar2;
                    cbVar2.a();
                    oz ozVar = (oz) this.b;
                    gl.r(ozVar);
                    gl.e3(ozVar, 500L);
                }
                va vaVar = dm0Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    if (z != (!TextUtils.isEmpty(obj2))) {
                        dm0Var.a.f3.g1(0, 0);
                        break;
                    }
                }
                break;
            case 1:
                String obj3 = editTextBoldCursor.getText().toString();
                kr4 kr4Var = ((sr4) obj).r;
                s54 s54Var = kr4Var.w;
                if (!TextUtils.equals(kr4Var.f, obj3)) {
                    if (kr4Var.e != -1) {
                        ConnectionsManager.getInstance(kr4Var.x.a).cancelRequest(kr4Var.e, true);
                        kr4Var.e = -1;
                    }
                    kr4Var.d = false;
                    kr4Var.h = null;
                }
                kr4Var.f = obj3;
                gl.r(s54Var);
                if (!TextUtils.isEmpty(obj3)) {
                    kr4Var.F(true);
                    gl.e3(s54Var, 1500L);
                    break;
                } else {
                    kr4Var.c.clear();
                    kr4Var.F(false);
                    kr4Var.f();
                    break;
                }
            case 2:
                me5 me5Var = (me5) obj;
                boolean z2 = !TextUtils.isEmpty(me5Var.r);
                String obj4 = editTextBoldCursor.getText().toString();
                if (!TextUtils.equals(me5Var.r, obj4)) {
                    me5Var.r = obj4;
                    me5Var.n = true;
                    iu4 iu4Var = (iu4) this.b;
                    gl.r(iu4Var);
                    gl.e3(iu4Var, 500L);
                    me5Var.y.d.setText(k96.M0(TextUtils.isEmpty(obj4) ? 2131742655 : 2131742654, null));
                }
                va vaVar2 = me5Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    if (z2 != (!TextUtils.isEmpty(obj4))) {
                        me5Var.a.f3.g1(0, 0);
                        break;
                    }
                }
                break;
            default:
                oq7 oq7Var = (oq7) this.b;
                u58 u58Var = (u58) obj;
                if (editTextBoldCursor.getText().length() != 0) {
                    gl.r(oq7Var);
                    gl.e3(oq7Var, 1200L);
                    break;
                } else {
                    u58Var.f.clear();
                    u58Var.h.clear();
                    u58Var.w = null;
                    u58Var.s = true;
                    u58Var.r = false;
                    if (u58Var.y != 0) {
                        i2 = ((d) u58Var).currentAccount;
                        ConnectionsManager.getInstance(i2).cancelRequest(u58Var.y, true);
                        u58Var.y = 0;
                    }
                    u58Var.O.d.setText(k96.M0(2131747977, null));
                    u58Var.O.e(false, true);
                    u58Var.n0();
                    break;
                }
        }
    }

    public cm0(sr4 sr4Var) {
        this.a = (byte) 1;
        this.c = sr4Var;
    }

    public cm0(me5 me5Var) {
        this.a = (byte) 2;
        this.c = me5Var;
        this.b = new iu4(this, (byte) 23);
    }

    public cm0(u58 u58Var) {
        this.a = (byte) 3;
        this.c = u58Var;
        this.b = new oq7(this, (byte) 22);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
