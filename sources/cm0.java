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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class cm0 extends o7 {
    public final /* synthetic */ byte a;
    public Object b;
    public final /* synthetic */ Object c;

    public cm0(dm0 dm0Var) {
        this.a = (byte) 0;
        this.c = dm0Var;
        this.b = new pz(this, (byte) 14);
    }

    public static boolean n(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || uh9.t(" ", lowerCase2, lowerCase) || uh9.t(".", lowerCase2, lowerCase)) {
            return true;
        }
        String I3 = hl.I3(lowerCase);
        String I32 = hl.I3(lowerCase2);
        return I3.startsWith(I32) || I3.contains(" ".concat(I32)) || I3.contains(".".concat(I32));
    }

    @Override // o7
    public final boolean b() {
        switch (this.a) {
            case 3:
                ((l98) this.c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // o7
    public final void h() {
        byte b = this.a;
        Object obj = this.c;
        byte b2 = 1;
        switch (b) {
            case 0:
                dm0 dm0Var = (dm0) obj;
                dm0Var.w = null;
                hl.r((pz) this.b);
                db dbVar = dm0Var.f;
                if (dbVar != null) {
                    dbVar.c();
                    dm0Var.f = null;
                }
                wa waVar = dm0Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
                    dm0Var.a.f3.g1(0, 0);
                    break;
                }
                break;
            case 1:
                wt4 wt4Var = (wt4) obj;
                gu guVar = wt4Var.d;
                m52 m52Var = wt4Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                m52Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(m52Var, (Property<m52, Float>) property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(m52Var, (Property<m52, Float>) property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(m52Var, (Property<m52, Float>) property3, 1.0f));
                EditTextBoldCursor searchField = wt4Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
                }
                guVar.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(guVar, (Property<gu, Float>) property3, 1.0f));
                guVar.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(wt4Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new mt4(this, b2));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(k43.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new v5(this, searchField, (byte) 24));
                ((AnimatorSet) this.b).start();
                break;
            case 2:
                ng5 ng5Var = (ng5) obj;
                ng5Var.r = null;
                ng5Var.n = false;
                hl.r((ea5) this.b);
                wa waVar2 = ng5Var.a;
                if (waVar2 != null) {
                    waVar2.g3.O(true);
                    ng5Var.a.f3.g1(0, 0);
                }
                ng5Var.y.d.setText(ob6.M0(TextUtils.isEmpty(ng5Var.r) ? 2131742549 : 2131742548, null));
                break;
        }
    }

    @Override // o7
    public final void i() {
        switch (this.a) {
            case 1:
                wt4 wt4Var = (wt4) this.c;
                gu guVar = wt4Var.d;
                FrameLayout frameLayout = wt4Var.h;
                m52 m52Var = wt4Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                byte b = 0;
                arrayList.add(ObjectAnimator.ofFloat(m52Var, (Property<m52, Float>) property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(m52Var, (Property<m52, Float>) property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(m52Var, (Property<m52, Float>) property3, 0.0f));
                EditTextBoldCursor searchField = wt4Var.H.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(guVar, (Property<gu, Float>) property3, 0.0f));
                guVar.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
                wt4Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new mt4(this, b));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(k43.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new cn2(this, (byte) 24));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // o7
    public final void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 3:
                ((l98) this.c).f0(editTextBoldCursor);
                break;
        }
    }

    @Override // o7
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
                    db dbVar = dm0Var.f;
                    if (dbVar != null) {
                        dbVar.c();
                    }
                    i = ((e) dm0Var).currentAccount;
                    db dbVar2 = new db(obj2, i, new pz(dm0Var, (byte) 13));
                    dm0Var.f = dbVar2;
                    dbVar2.a();
                    pz pzVar = (pz) this.b;
                    hl.r(pzVar);
                    hl.d3(pzVar, 500L);
                }
                wa waVar = dm0Var.a;
                if (waVar != null) {
                    waVar.g3.O(true);
                    if (z != (!TextUtils.isEmpty(obj2))) {
                        dm0Var.a.f3.g1(0, 0);
                        break;
                    }
                }
                break;
            case 1:
                String obj3 = editTextBoldCursor.getText().toString();
                ot4 ot4Var = ((wt4) obj).r;
                rj4 rj4Var = ot4Var.w;
                if (!TextUtils.equals(ot4Var.f, obj3)) {
                    if (ot4Var.e != -1) {
                        ConnectionsManager.getInstance(ot4Var.x.a).cancelRequest(ot4Var.e, true);
                        ot4Var.e = -1;
                    }
                    ot4Var.d = false;
                    ot4Var.h = null;
                }
                ot4Var.f = obj3;
                hl.r(rj4Var);
                if (!TextUtils.isEmpty(obj3)) {
                    ot4Var.F(true);
                    hl.d3(rj4Var, 1500L);
                    break;
                } else {
                    ot4Var.c.clear();
                    ot4Var.F(false);
                    ot4Var.f();
                    break;
                }
            case 2:
                ng5 ng5Var = (ng5) obj;
                boolean z2 = !TextUtils.isEmpty(ng5Var.r);
                String obj4 = editTextBoldCursor.getText().toString();
                if (!TextUtils.equals(ng5Var.r, obj4)) {
                    ng5Var.r = obj4;
                    ng5Var.n = true;
                    ea5 ea5Var = (ea5) this.b;
                    hl.r(ea5Var);
                    hl.d3(ea5Var, 500L);
                    ng5Var.y.d.setText(ob6.M0(TextUtils.isEmpty(obj4) ? 2131742549 : 2131742548, null));
                }
                wa waVar2 = ng5Var.a;
                if (waVar2 != null) {
                    waVar2.g3.O(true);
                    if (z2 != (!TextUtils.isEmpty(obj4))) {
                        ng5Var.a.f3.g1(0, 0);
                        break;
                    }
                }
                break;
            default:
                x38 x38Var = (x38) this.b;
                l98 l98Var = (l98) obj;
                if (editTextBoldCursor.getText().length() != 0) {
                    hl.r(x38Var);
                    hl.d3(x38Var, 1200L);
                    break;
                } else {
                    l98Var.f.clear();
                    l98Var.h.clear();
                    l98Var.w = null;
                    l98Var.s = true;
                    l98Var.r = false;
                    if (l98Var.y != 0) {
                        i2 = ((e) l98Var).currentAccount;
                        ConnectionsManager.getInstance(i2).cancelRequest(l98Var.y, true);
                        l98Var.y = 0;
                    }
                    l98Var.O.d.setText(ob6.M0(2131747900, null));
                    l98Var.O.e(false, true);
                    l98Var.n0();
                    break;
                }
        }
    }

    public cm0(wt4 wt4Var) {
        this.a = (byte) 1;
        this.c = wt4Var;
    }

    public cm0(ng5 ng5Var) {
        this.a = (byte) 2;
        this.c = ng5Var;
        this.b = new ea5(this, (byte) 8);
    }

    public cm0(l98 l98Var) {
        this.a = (byte) 3;
        this.c = l98Var;
        this.b = new x38(this, (byte) 7);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
