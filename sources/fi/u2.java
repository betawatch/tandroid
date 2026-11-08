package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ef0;
import org.telegram.ui.xm0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class u2 extends org.telegram.ui.ActionBar.n0 {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public u2(f3 f3Var) {
        this.a = 0;
        this.c = f3Var;
    }

    public static boolean n(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || jg.g.A(" ", lowerCase2, lowerCase) || jg.g.A(".", lowerCase2, lowerCase)) {
            return true;
        }
        String O3 = org.telegram.messenger.g0.O3(lowerCase);
        String O32 = org.telegram.messenger.g0.O3(lowerCase2);
        return O3.startsWith(O32) || O3.contains(" ".concat(O32)) || O3.contains(".".concat(O32));
    }

    @Override // org.telegram.ui.ActionBar.n0
    public boolean b() {
        switch (this.a) {
            case 1:
                ((xm0) this.c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void h() {
        int i7 = this.a;
        Object obj = this.c;
        int i10 = 1;
        switch (i7) {
            case 0:
                f3 f3Var = (f3) obj;
                bi.q1 q1Var = f3Var.d;
                w2 w2Var = f3Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                w2Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property3, 1.0f));
                EditTextBoldCursor searchField = f3Var.G.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
                }
                q1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(q1Var, (Property<bi.q1, Float>) property3, 1.0f));
                q1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(f3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new t2(this, i10));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(xq.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new ah.l(4, this, searchField));
                ((AnimatorSet) this.b).start();
                break;
            case 2:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj;
                lVar.w = null;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.m5) this.b);
                org.telegram.ui.web.h hVar = lVar.f;
                if (hVar != null) {
                    hVar.c();
                    lVar.f = null;
                }
                w3 w3Var = lVar.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    lVar.a.e3.h1(0, 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                z0Var.r = null;
                z0Var.n = false;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.m5) this.b);
                w3 w3Var2 = z0Var.a;
                if (w3Var2 != null) {
                    w3Var2.f3.O(true);
                    z0Var.a.e3.h1(0, 0);
                }
                z0Var.y.d.setText(id.M0(TextUtils.isEmpty(z0Var.r) ? 2131742921 : 2131742920, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void i() {
        switch (this.a) {
            case 0:
                f3 f3Var = (f3) this.c;
                bi.q1 q1Var = f3Var.d;
                FrameLayout frameLayout = f3Var.h;
                w2 w2Var = f3Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                int i7 = 0;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(w2Var, (Property<w2, Float>) property3, 0.0f));
                EditTextBoldCursor searchField = f3Var.G.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(q1Var, (Property<bi.q1, Float>) property3, 0.0f));
                q1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
                f3Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new t2(this, i7));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(xq.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new bi.t5(this, 18));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                ((xm0) this.c).g0(editTextBoldCursor);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.n0
    public final void l(EditText editText) {
        int i7;
        int i10;
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                String obj2 = editText.getText().toString();
                x2 x2Var = ((f3) obj).r;
                di.s7 s7Var = x2Var.w;
                if (!TextUtils.equals(x2Var.f, obj2)) {
                    if (x2Var.e != -1) {
                        ConnectionsManager.getInstance(x2Var.x.a).cancelRequest(x2Var.e, true);
                        x2Var.e = -1;
                    }
                    x2Var.d = false;
                    x2Var.h = null;
                }
                x2Var.f = obj2;
                org.telegram.messenger.g0.r(s7Var);
                if (!TextUtils.isEmpty(obj2)) {
                    x2Var.F(true);
                    org.telegram.messenger.g0.i3(s7Var, 1500L);
                    break;
                } else {
                    x2Var.c.clear();
                    x2Var.F(false);
                    x2Var.f();
                    break;
                }
            case 1:
                ef0 ef0Var = (ef0) this.b;
                xm0 xm0Var = (xm0) obj;
                if (editText.getText().length() != 0) {
                    org.telegram.messenger.g0.r(ef0Var);
                    org.telegram.messenger.g0.i3(ef0Var, 1200L);
                    break;
                } else {
                    xm0Var.f.clear();
                    xm0Var.h.clear();
                    xm0Var.w = null;
                    xm0Var.s = true;
                    xm0Var.r = false;
                    if (xm0Var.y != 0) {
                        i7 = ((org.telegram.ui.ActionBar.f2) xm0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).cancelRequest(xm0Var.y, true);
                        xm0Var.y = 0;
                    }
                    xm0Var.N.d.setText(id.M0(2131748170, null));
                    xm0Var.N.e(false, true);
                    xm0Var.o0();
                    break;
                }
            case 2:
                org.telegram.ui.web.l lVar = (org.telegram.ui.web.l) obj;
                boolean z9 = !TextUtils.isEmpty(lVar.w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(lVar.w, obj3)) {
                    lVar.w = obj3;
                    org.telegram.ui.web.h hVar = lVar.f;
                    if (hVar != null) {
                        hVar.c();
                    }
                    i10 = ((org.telegram.ui.ActionBar.f2) lVar).currentAccount;
                    org.telegram.ui.web.h hVar2 = new org.telegram.ui.web.h(obj3, i10, new org.telegram.ui.web.k(lVar, 1));
                    lVar.f = hVar2;
                    hVar2.a();
                    org.telegram.ui.ActionBar.m5 m5Var = (org.telegram.ui.ActionBar.m5) this.b;
                    org.telegram.messenger.g0.r(m5Var);
                    org.telegram.messenger.g0.i3(m5Var, 500L);
                }
                w3 w3Var = lVar.a;
                if (w3Var != null) {
                    w3Var.f3.O(true);
                    if (z9 != (!TextUtils.isEmpty(obj3))) {
                        lVar.a.e3.h1(0, 0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                boolean z10 = !TextUtils.isEmpty(z0Var.r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(z0Var.r, obj4)) {
                    z0Var.r = obj4;
                    z0Var.n = true;
                    org.telegram.ui.ActionBar.m5 m5Var2 = (org.telegram.ui.ActionBar.m5) this.b;
                    org.telegram.messenger.g0.r(m5Var2);
                    org.telegram.messenger.g0.i3(m5Var2, 500L);
                    z0Var.y.d.setText(id.M0(TextUtils.isEmpty(obj4) ? 2131742921 : 2131742920, null));
                }
                w3 w3Var2 = z0Var.a;
                if (w3Var2 != null) {
                    w3Var2.f3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj4))) {
                        z0Var.a.e3.h1(0, 0);
                        break;
                    }
                }
                break;
        }
    }

    public u2(xm0 xm0Var) {
        this.a = 1;
        this.c = xm0Var;
        this.b = new ef0(this, 15);
    }

    public u2(org.telegram.ui.web.l lVar) {
        this.a = 2;
        this.c = lVar;
        this.b = new org.telegram.ui.ActionBar.m5(this, 12);
    }

    public u2(org.telegram.ui.web.z0 z0Var) {
        this.a = 3;
        this.c = z0Var;
        this.b = new org.telegram.ui.ActionBar.m5(this, 15);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
