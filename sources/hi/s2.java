package hi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.nr;
import org.telegram.ui.cn0;
import org.telegram.ui.hf0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class s2 extends org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public s2(d3 d3Var) {
        this.a = 0;
        this.c = d3Var;
    }

    public static boolean n(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || i5.c.B(" ", lowerCase2, lowerCase) || i5.c.B(".", lowerCase2, lowerCase)) {
            return true;
        }
        String M3 = org.telegram.messenger.g0.M3(lowerCase);
        String M32 = org.telegram.messenger.g0.M3(lowerCase2);
        return M3.startsWith(M32) || M3.contains(" ".concat(M32)) || M3.contains(".".concat(M32));
    }

    @Override // org.telegram.ui.ActionBar.m0
    public boolean b() {
        switch (this.a) {
            case 1:
                ((cn0) this.c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void h() {
        int i7 = this.a;
        Object obj = this.c;
        int i10 = 1;
        switch (i7) {
            case 0:
                d3 d3Var = (d3) obj;
                di.b1 b1Var = d3Var.d;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                u2Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property3, 1.0f));
                EditTextBoldCursor searchField = d3Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
                }
                b1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(b1Var, (Property<di.b1, Float>) property3, 1.0f));
                b1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(d3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, i10));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(nr.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new ah.l(4, this, searchField));
                ((AnimatorSet) this.b).start();
                break;
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.w = null;
                org.telegram.messenger.g0.r((oi.c2) this.b);
                org.telegram.ui.web.i iVar = mVar.f;
                if (iVar != null) {
                    iVar.c();
                    mVar.f = null;
                }
                bi.g6 g6Var = mVar.a;
                if (g6Var != null) {
                    g6Var.g3.O(true);
                    mVar.a.f3.h1(0, 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                x0Var.r = null;
                x0Var.n = false;
                org.telegram.messenger.g0.r((oi.c2) this.b);
                bi.g6 g6Var2 = x0Var.a;
                if (g6Var2 != null) {
                    g6Var2.g3.O(true);
                    x0Var.a.f3.h1(0, 0);
                }
                x0Var.y.d.setText(gd.N0(TextUtils.isEmpty(x0Var.r) ? 2131742654 : 2131742653, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.c;
                di.b1 b1Var = d3Var.d;
                FrameLayout frameLayout = d3Var.h;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                int i7 = 0;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(u2Var, (Property<u2, Float>) property3, 0.0f));
                EditTextBoldCursor searchField = d3Var.H.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(b1Var, (Property<di.b1, Float>) property3, 0.0f));
                b1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
                d3Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, i7));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(nr.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new ai.k0(this, 20));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                ((cn0) this.c).g0(editTextBoldCursor);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        int i7;
        int i10;
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                String obj2 = editText.getText().toString();
                v2 v2Var = ((d3) obj).r;
                l lVar = v2Var.w;
                if (!TextUtils.equals(v2Var.f, obj2)) {
                    if (v2Var.e != -1) {
                        ConnectionsManager.getInstance(v2Var.x.a).cancelRequest(v2Var.e, true);
                        v2Var.e = -1;
                    }
                    v2Var.d = false;
                    v2Var.h = null;
                }
                v2Var.f = obj2;
                org.telegram.messenger.g0.r(lVar);
                if (!TextUtils.isEmpty(obj2)) {
                    v2Var.F(true);
                    org.telegram.messenger.g0.h3(lVar, 1500L);
                    break;
                } else {
                    v2Var.c.clear();
                    v2Var.F(false);
                    v2Var.f();
                    break;
                }
            case 1:
                hf0 hf0Var = (hf0) this.b;
                cn0 cn0Var = (cn0) obj;
                if (editText.getText().length() != 0) {
                    org.telegram.messenger.g0.r(hf0Var);
                    org.telegram.messenger.g0.h3(hf0Var, 1200L);
                    break;
                } else {
                    cn0Var.f.clear();
                    cn0Var.h.clear();
                    cn0Var.w = null;
                    cn0Var.s = true;
                    cn0Var.r = false;
                    if (cn0Var.y != 0) {
                        i7 = ((org.telegram.ui.ActionBar.g2) cn0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).cancelRequest(cn0Var.y, true);
                        cn0Var.y = 0;
                    }
                    cn0Var.O.d.setText(gd.N0(2131747976, null));
                    cn0Var.O.e(false, true);
                    cn0Var.o0();
                    break;
                }
            case 2:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(mVar.w, obj3)) {
                    mVar.w = obj3;
                    org.telegram.ui.web.i iVar = mVar.f;
                    if (iVar != null) {
                        iVar.c();
                    }
                    i10 = ((org.telegram.ui.ActionBar.g2) mVar).currentAccount;
                    org.telegram.ui.web.i iVar2 = new org.telegram.ui.web.i(obj3, i10, new org.telegram.ui.web.l(mVar, 1));
                    mVar.f = iVar2;
                    iVar2.a();
                    oi.c2 c2Var = (oi.c2) this.b;
                    org.telegram.messenger.g0.r(c2Var);
                    org.telegram.messenger.g0.h3(c2Var, 500L);
                }
                bi.g6 g6Var = mVar.a;
                if (g6Var != null) {
                    g6Var.g3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj3))) {
                        mVar.a.f3.h1(0, 0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                boolean z11 = !TextUtils.isEmpty(x0Var.r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(x0Var.r, obj4)) {
                    x0Var.r = obj4;
                    x0Var.n = true;
                    oi.c2 c2Var2 = (oi.c2) this.b;
                    org.telegram.messenger.g0.r(c2Var2);
                    org.telegram.messenger.g0.h3(c2Var2, 500L);
                    x0Var.y.d.setText(gd.N0(TextUtils.isEmpty(obj4) ? 2131742654 : 2131742653, null));
                }
                bi.g6 g6Var2 = x0Var.a;
                if (g6Var2 != null) {
                    g6Var2.g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        x0Var.a.f3.h1(0, 0);
                        break;
                    }
                }
                break;
        }
    }

    public s2(cn0 cn0Var) {
        this.a = 1;
        this.c = cn0Var;
        this.b = new hf0(this, 15);
    }

    public s2(org.telegram.ui.web.m mVar) {
        this.a = 2;
        this.c = mVar;
        this.b = new oi.c2(this, 26);
    }

    public s2(org.telegram.ui.web.x0 x0Var) {
        this.a = 3;
        this.c = x0Var;
        this.b = new oi.c2(this, 29);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
