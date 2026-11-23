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
import org.telegram.ui.Components.kr;
import org.telegram.ui.an0;
import org.telegram.ui.gf0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class b3 extends org.telegram.ui.ActionBar.m0 {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public b3(m3 m3Var) {
        this.a = 0;
        this.c = m3Var;
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
                ((an0) this.c).finishFragment();
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
                m3 m3Var = (m3) obj;
                di.b1 b1Var = m3Var.d;
                d3 d3Var = m3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                d3Var.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property3, 1.0f));
                EditTextBoldCursor searchField = m3Var.H.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
                }
                b1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(b1Var, (Property<di.b1, Float>) property3, 1.0f));
                b1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(m3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a3(this, i10));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(kr.h);
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
                bi.i6 i6Var = mVar.a;
                if (i6Var != null) {
                    i6Var.g3.O(true);
                    mVar.a.f3.h1(0, 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                x0Var.r = null;
                x0Var.n = false;
                org.telegram.messenger.g0.r((oi.c2) this.b);
                bi.i6 i6Var2 = x0Var.a;
                if (i6Var2 != null) {
                    i6Var2.g3.O(true);
                    x0Var.a.f3.h1(0, 0);
                }
                x0Var.y.d.setText(gd.N0(TextUtils.isEmpty(x0Var.r) ? 2131742647 : 2131742646, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        switch (this.a) {
            case 0:
                m3 m3Var = (m3) this.c;
                di.b1 b1Var = m3Var.d;
                FrameLayout frameLayout = m3Var.h;
                d3 d3Var = m3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                int i7 = 0;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property3, 0.0f));
                EditTextBoldCursor searchField = m3Var.H.getSearchField();
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
                m3Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a3(this, i7));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(kr.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new ai.g0(this, 20));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                ((an0) this.c).g0(editTextBoldCursor);
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
                e3 e3Var = ((m3) obj).r;
                w wVar = e3Var.w;
                if (!TextUtils.equals(e3Var.f, obj2)) {
                    if (e3Var.e != -1) {
                        ConnectionsManager.getInstance(e3Var.x.a).cancelRequest(e3Var.e, true);
                        e3Var.e = -1;
                    }
                    e3Var.d = false;
                    e3Var.h = null;
                }
                e3Var.f = obj2;
                org.telegram.messenger.g0.r(wVar);
                if (!TextUtils.isEmpty(obj2)) {
                    e3Var.F(true);
                    org.telegram.messenger.g0.h3(wVar, 1500L);
                    break;
                } else {
                    e3Var.c.clear();
                    e3Var.F(false);
                    e3Var.f();
                    break;
                }
            case 1:
                gf0 gf0Var = (gf0) this.b;
                an0 an0Var = (an0) obj;
                if (editText.getText().length() != 0) {
                    org.telegram.messenger.g0.r(gf0Var);
                    org.telegram.messenger.g0.h3(gf0Var, 1200L);
                    break;
                } else {
                    an0Var.f.clear();
                    an0Var.h.clear();
                    an0Var.w = null;
                    an0Var.s = true;
                    an0Var.r = false;
                    if (an0Var.y != 0) {
                        i7 = ((org.telegram.ui.ActionBar.g2) an0Var).currentAccount;
                        ConnectionsManager.getInstance(i7).cancelRequest(an0Var.y, true);
                        an0Var.y = 0;
                    }
                    an0Var.O.d.setText(gd.N0(2131747976, null));
                    an0Var.O.e(false, true);
                    an0Var.o0();
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
                bi.i6 i6Var = mVar.a;
                if (i6Var != null) {
                    i6Var.g3.O(true);
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
                    x0Var.y.d.setText(gd.N0(TextUtils.isEmpty(obj4) ? 2131742647 : 2131742646, null));
                }
                bi.i6 i6Var2 = x0Var.a;
                if (i6Var2 != null) {
                    i6Var2.g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        x0Var.a.f3.h1(0, 0);
                        break;
                    }
                }
                break;
        }
    }

    public b3(an0 an0Var) {
        this.a = 1;
        this.c = an0Var;
        this.b = new gf0(this, 15);
    }

    public b3(org.telegram.ui.web.m mVar) {
        this.a = 2;
        this.c = mVar;
        this.b = new oi.c2(this, 26);
    }

    public b3(org.telegram.ui.web.x0 x0Var) {
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
