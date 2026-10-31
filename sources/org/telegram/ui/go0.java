package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class go0 extends org.telegram.ui.ActionBar.p0 {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public go0(lo0 lo0Var) {
        this.a = 0;
        this.c = lo0Var;
        this.b = new mg0(this, 15);
    }

    public static boolean n(String str, String str2) {
        if (str == null || str2 == null) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        if (lowerCase.startsWith(lowerCase2) || sc.e.y(" ", lowerCase2, lowerCase) || sc.e.y(".", lowerCase2, lowerCase)) {
            return true;
        }
        String N3 = org.telegram.messenger.i0.N3(lowerCase);
        String N32 = org.telegram.messenger.i0.N3(lowerCase2);
        return N3.startsWith(N32) || N3.contains(" ".concat(N32)) || N3.contains(".".concat(N32));
    }

    @Override // org.telegram.ui.ActionBar.p0
    public boolean b() {
        switch (this.a) {
            case 0:
                ((lo0) this.c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void h() {
        int i10 = this.a;
        Object obj = this.c;
        int i11 = 1;
        switch (i10) {
            case 1:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                mVar.w = null;
                org.telegram.messenger.i0.r((org.telegram.ui.ActionBar.w5) this.b);
                org.telegram.ui.web.h hVar = mVar.f;
                if (hVar != null) {
                    hVar.c();
                    mVar.f = null;
                }
                org.telegram.ui.Components.ii iiVar = mVar.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    mVar.a.e3.h1(0, 0);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                b1Var.r = null;
                b1Var.n = false;
                org.telegram.messenger.i0.r((org.telegram.ui.ActionBar.w5) this.b);
                org.telegram.ui.Components.ii iiVar2 = b1Var.a;
                if (iiVar2 != null) {
                    iiVar2.f3.O(true);
                    b1Var.a.e3.h1(0, 0);
                }
                b1Var.y.d.setText(org.telegram.messenger.cd.L0(TextUtils.isEmpty(b1Var.r) ? 2131742944 : 2131742943, null));
                break;
            case 3:
                vh.k2 k2Var = (vh.k2) obj;
                nb0 nb0Var = k2Var.d;
                org.telegram.ui.Components.tl tlVar = k2Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                tlVar.setVisibility(0);
                Property property = View.SCALE_X;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, (Property<org.telegram.ui.Components.tl, Float>) property, 1.0f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, (Property<org.telegram.ui.Components.tl, Float>) property2, 1.0f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, (Property<org.telegram.ui.Components.tl, Float>) property3, 1.0f));
                EditTextBoldCursor searchField = k2Var.G.getSearchField();
                if (searchField != null) {
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
                }
                nb0Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(nb0Var, (Property<nb0, Float>) property3, 1.0f));
                nb0Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(k2Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new vh.c2(this, i11));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(org.telegram.ui.Components.gr.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new org.telegram.ui.Components.iw0(19, this, searchField));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void i() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
                break;
            default:
                vh.k2 k2Var = (vh.k2) this.c;
                nb0 nb0Var = k2Var.d;
                FrameLayout frameLayout = k2Var.h;
                org.telegram.ui.Components.tl tlVar = k2Var.F;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                int i10 = 0;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, (Property<org.telegram.ui.Components.tl, Float>) property, 0.8f));
                Property property2 = View.SCALE_Y;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, (Property<org.telegram.ui.Components.tl, Float>) property2, 0.8f));
                Property property3 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(tlVar, (Property<org.telegram.ui.Components.tl, Float>) property3, 0.0f));
                EditTextBoldCursor searchField = k2Var.G.getSearchField();
                if (searchField != null) {
                    searchField.setVisibility(0);
                    searchField.setHandlesColor(-1);
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
                    arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
                }
                frameLayout.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(nb0Var, (Property<nb0, Float>) property3, 0.0f));
                nb0Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
                k2Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new vh.c2(this, i10));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(org.telegram.ui.Components.gr.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new sg.r(this, 15));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 0:
                ((lo0) this.c).f0(editTextBoldCursor);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.p0
    public final void l(EditText editText) {
        int i10;
        int i11;
        int i12 = this.a;
        Object obj = this.c;
        switch (i12) {
            case 0:
                mg0 mg0Var = (mg0) this.b;
                lo0 lo0Var = (lo0) obj;
                if (editText.getText().length() != 0) {
                    org.telegram.messenger.i0.r(mg0Var);
                    org.telegram.messenger.i0.h3(mg0Var, 1200L);
                    break;
                } else {
                    lo0Var.f.clear();
                    lo0Var.h.clear();
                    lo0Var.w = null;
                    lo0Var.s = true;
                    lo0Var.r = false;
                    if (lo0Var.y != 0) {
                        i10 = ((org.telegram.ui.ActionBar.k2) lo0Var).currentAccount;
                        ConnectionsManager.getInstance(i10).cancelRequest(lo0Var.y, true);
                        lo0Var.y = 0;
                    }
                    lo0Var.N.d.setText(org.telegram.messenger.cd.L0(2131748185, null));
                    lo0Var.N.e(false, true);
                    lo0Var.n0();
                    break;
                }
            case 1:
                org.telegram.ui.web.m mVar = (org.telegram.ui.web.m) obj;
                boolean z10 = !TextUtils.isEmpty(mVar.w);
                String obj2 = editText.getText().toString();
                if (!TextUtils.equals(mVar.w, obj2)) {
                    mVar.w = obj2;
                    org.telegram.ui.web.h hVar = mVar.f;
                    if (hVar != null) {
                        hVar.c();
                    }
                    i11 = ((org.telegram.ui.ActionBar.k2) mVar).currentAccount;
                    org.telegram.ui.web.h hVar2 = new org.telegram.ui.web.h(obj2, i11, new org.telegram.ui.web.k(mVar, 1));
                    mVar.f = hVar2;
                    hVar2.a();
                    org.telegram.ui.ActionBar.w5 w5Var = (org.telegram.ui.ActionBar.w5) this.b;
                    org.telegram.messenger.i0.r(w5Var);
                    org.telegram.messenger.i0.h3(w5Var, 500L);
                }
                org.telegram.ui.Components.ii iiVar = mVar.a;
                if (iiVar != null) {
                    iiVar.f3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj2))) {
                        mVar.a.e3.h1(0, 0);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                boolean z11 = !TextUtils.isEmpty(b1Var.r);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(b1Var.r, obj3)) {
                    b1Var.r = obj3;
                    b1Var.n = true;
                    org.telegram.ui.ActionBar.w5 w5Var2 = (org.telegram.ui.ActionBar.w5) this.b;
                    org.telegram.messenger.i0.r(w5Var2);
                    org.telegram.messenger.i0.h3(w5Var2, 500L);
                    b1Var.y.d.setText(org.telegram.messenger.cd.L0(TextUtils.isEmpty(obj3) ? 2131742944 : 2131742943, null));
                }
                org.telegram.ui.Components.ii iiVar2 = b1Var.a;
                if (iiVar2 != null) {
                    iiVar2.f3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj3))) {
                        b1Var.a.e3.h1(0, 0);
                        break;
                    }
                }
                break;
            default:
                String obj4 = editText.getText().toString();
                vh.e2 e2Var = ((vh.k2) obj).r;
                vh.d0 d0Var = e2Var.w;
                if (!TextUtils.equals(e2Var.f, obj4)) {
                    if (e2Var.e != -1) {
                        ConnectionsManager.getInstance(e2Var.x.a).cancelRequest(e2Var.e, true);
                        e2Var.e = -1;
                    }
                    e2Var.d = false;
                    e2Var.h = null;
                }
                e2Var.f = obj4;
                org.telegram.messenger.i0.r(d0Var);
                if (!TextUtils.isEmpty(obj4)) {
                    e2Var.F(true);
                    org.telegram.messenger.i0.h3(d0Var, 1500L);
                    break;
                } else {
                    e2Var.c.clear();
                    e2Var.F(false);
                    e2Var.f();
                    break;
                }
        }
    }

    public go0(org.telegram.ui.web.m mVar) {
        this.a = 1;
        this.c = mVar;
        this.b = new org.telegram.ui.ActionBar.w5(this, 13);
    }

    public go0(org.telegram.ui.web.b1 b1Var) {
        this.a = 2;
        this.c = b1Var;
        this.b = new org.telegram.ui.ActionBar.w5(this, 16);
    }

    public go0(vh.k2 k2Var) {
        this.a = 3;
        this.c = k2Var;
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
