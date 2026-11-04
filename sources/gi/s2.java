package gi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
import org.telegram.ui.sg0;
import org.telegram.ui.sm0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
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
        if (lowerCase.startsWith(lowerCase2) || k2.p1.z(" ", lowerCase2, lowerCase) || k2.p1.z(".", lowerCase2, lowerCase)) {
            return true;
        }
        String O3 = org.telegram.messenger.g0.O3(lowerCase);
        String O32 = org.telegram.messenger.g0.O3(lowerCase2);
        return O3.startsWith(O32) || O3.contains(" ".concat(O32)) || O3.contains(".".concat(O32));
    }

    @Override // org.telegram.ui.ActionBar.m0
    public boolean b() {
        switch (this.a) {
            case 1:
                ((sm0) this.c).finishFragment();
                return false;
            default:
                return super.b();
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void h() {
        int i3 = this.a;
        Object obj = this.c;
        int i10 = 1;
        switch (i3) {
            case 0:
                d3 d3Var = (d3) obj;
                ci.j1 j1Var = d3Var.d;
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
                j1Var.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(j1Var, (Property<ci.j1, Float>) property3, 1.0f));
                j1Var.setFastScrollVisible(true);
                arrayList.add(ObjectAnimator.ofFloat(d3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, i10));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(xq.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new bh.j(4, this, searchField));
                ((AnimatorSet) this.b).start();
                break;
            case 2:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj;
                nVar.w = null;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.d4) this.b);
                org.telegram.ui.web.j jVar = nVar.f;
                if (jVar != null) {
                    jVar.c();
                    nVar.f = null;
                }
                ai.h4 h4Var = nVar.a;
                if (h4Var != null) {
                    h4Var.g3.O(true);
                    nVar.a.f3.h1(0, 0);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                y0Var.r = null;
                y0Var.n = false;
                org.telegram.messenger.g0.r((org.telegram.ui.ActionBar.d4) this.b);
                ai.h4 h4Var2 = y0Var.a;
                if (h4Var2 != null) {
                    h4Var2.g3.O(true);
                    y0Var.a.f3.h1(0, 0);
                }
                y0Var.y.d.setText(bd.M0(TextUtils.isEmpty(y0Var.r) ? 2131742928 : 2131742927, null));
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void i() {
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.c;
                ci.j1 j1Var = d3Var.d;
                FrameLayout frameLayout = d3Var.h;
                u2 u2Var = d3Var.G;
                AnimatorSet animatorSet = (AnimatorSet) this.b;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ArrayList arrayList = new ArrayList();
                Property property = View.SCALE_X;
                int i3 = 0;
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
                arrayList.add(ObjectAnimator.ofFloat(j1Var, (Property<ci.j1, Float>) property3, 0.0f));
                j1Var.setFastScrollVisible(false);
                arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
                d3Var.s.setVisibility(0);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new r2(this, i3));
                arrayList.add(ofFloat);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.b = animatorSet2;
                animatorSet2.setDuration(320L);
                ((AnimatorSet) this.b).setInterpolator(xq.h);
                ((AnimatorSet) this.b).playTogether(arrayList);
                ((AnimatorSet) this.b).addListener(new ai.e1(this, 20));
                ((AnimatorSet) this.b).start();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void k(EditTextBoldCursor editTextBoldCursor) {
        switch (this.a) {
            case 1:
                ((sm0) this.c).g0(editTextBoldCursor);
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.m0
    public final void l(EditText editText) {
        int i3;
        int i10;
        int i11 = this.a;
        Object obj = this.c;
        switch (i11) {
            case 0:
                String obj2 = editText.getText().toString();
                v2 v2Var = ((d3) obj).r;
                ei.z5 z5Var = v2Var.w;
                if (!TextUtils.equals(v2Var.f, obj2)) {
                    if (v2Var.e != -1) {
                        ConnectionsManager.getInstance(v2Var.x.a).cancelRequest(v2Var.e, true);
                        v2Var.e = -1;
                    }
                    v2Var.d = false;
                    v2Var.h = null;
                }
                v2Var.f = obj2;
                org.telegram.messenger.g0.r(z5Var);
                if (!TextUtils.isEmpty(obj2)) {
                    v2Var.F(true);
                    org.telegram.messenger.g0.i3(z5Var, 1500L);
                    break;
                } else {
                    v2Var.c.clear();
                    v2Var.F(false);
                    v2Var.f();
                    break;
                }
            case 1:
                sg0 sg0Var = (sg0) this.b;
                sm0 sm0Var = (sm0) obj;
                if (editText.getText().length() != 0) {
                    org.telegram.messenger.g0.r(sg0Var);
                    org.telegram.messenger.g0.i3(sg0Var, 1200L);
                    break;
                } else {
                    sm0Var.f.clear();
                    sm0Var.h.clear();
                    sm0Var.w = null;
                    sm0Var.s = true;
                    sm0Var.r = false;
                    if (sm0Var.y != 0) {
                        i3 = ((org.telegram.ui.ActionBar.d2) sm0Var).currentAccount;
                        ConnectionsManager.getInstance(i3).cancelRequest(sm0Var.y, true);
                        sm0Var.y = 0;
                    }
                    sm0Var.O.d.setText(bd.M0(2131748177, null));
                    sm0Var.O.e(false, true);
                    sm0Var.o0();
                    break;
                }
            case 2:
                org.telegram.ui.web.n nVar = (org.telegram.ui.web.n) obj;
                boolean z10 = !TextUtils.isEmpty(nVar.w);
                String obj3 = editText.getText().toString();
                if (!TextUtils.equals(nVar.w, obj3)) {
                    nVar.w = obj3;
                    org.telegram.ui.web.j jVar = nVar.f;
                    if (jVar != null) {
                        jVar.c();
                    }
                    i10 = ((org.telegram.ui.ActionBar.d2) nVar).currentAccount;
                    org.telegram.ui.web.j jVar2 = new org.telegram.ui.web.j(obj3, i10, new org.telegram.ui.web.m(nVar, 1));
                    nVar.f = jVar2;
                    jVar2.a();
                    org.telegram.ui.ActionBar.d4 d4Var = (org.telegram.ui.ActionBar.d4) this.b;
                    org.telegram.messenger.g0.r(d4Var);
                    org.telegram.messenger.g0.i3(d4Var, 500L);
                }
                ai.h4 h4Var = nVar.a;
                if (h4Var != null) {
                    h4Var.g3.O(true);
                    if (z10 != (!TextUtils.isEmpty(obj3))) {
                        nVar.a.f3.h1(0, 0);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                boolean z11 = !TextUtils.isEmpty(y0Var.r);
                String obj4 = editText.getText().toString();
                if (!TextUtils.equals(y0Var.r, obj4)) {
                    y0Var.r = obj4;
                    y0Var.n = true;
                    org.telegram.ui.ActionBar.d4 d4Var2 = (org.telegram.ui.ActionBar.d4) this.b;
                    org.telegram.messenger.g0.r(d4Var2);
                    org.telegram.messenger.g0.i3(d4Var2, 500L);
                    y0Var.y.d.setText(bd.M0(TextUtils.isEmpty(obj4) ? 2131742928 : 2131742927, null));
                }
                ai.h4 h4Var2 = y0Var.a;
                if (h4Var2 != null) {
                    h4Var2.g3.O(true);
                    if (z11 != (!TextUtils.isEmpty(obj4))) {
                        y0Var.a.f3.h1(0, 0);
                        break;
                    }
                }
                break;
        }
    }

    public s2(sm0 sm0Var) {
        this.a = 1;
        this.c = sm0Var;
        this.b = new sg0(this, 14);
    }

    public s2(org.telegram.ui.web.n nVar) {
        this.a = 2;
        this.c = nVar;
        this.b = new org.telegram.ui.ActionBar.d4(this, 17);
    }

    public s2(org.telegram.ui.web.y0 y0Var) {
        this.a = 3;
        this.c = y0Var;
        this.b = new org.telegram.ui.ActionBar.d4(this, 20);
    }

    private final void o() {
    }

    private final void p() {
    }

    private final void q() {
    }
}
