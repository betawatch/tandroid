package ci;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class d3 extends org.telegram.ui.ActionBar.e5 {
    public AnimatorSet f;
    public final /* synthetic */ w3 h;

    public d3(w3 w3Var) {
        this.h = w3Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        w3 w3Var = this.h;
        e3 e3Var = w3Var.d;
        k3 k3Var = w3Var.F;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        k3Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = w3Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        e3Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property3, 1.0f));
        e3Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(w3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new c3(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(rr.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new ai.z(2, this, searchField));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        w3 w3Var = this.h;
        e3 e3Var = w3Var.d;
        FrameLayout frameLayout = w3Var.h;
        k3 k3Var = w3Var.F;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(k3Var, (Property<k3, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = w3Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property3, 0.0f));
        e3Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        w3Var.s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new c3(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(rr.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new ai.b(this, 13));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        l3 l3Var = this.h.r;
        androidx.fragment.app.a0 a0Var = l3Var.v;
        if (!TextUtils.equals(l3Var.f, obj)) {
            if (l3Var.e != -1) {
                ConnectionsManager.getInstance(l3Var.w.a).cancelRequest(l3Var.e, true);
                l3Var.e = -1;
            }
            l3Var.d = false;
            l3Var.h = null;
        }
        l3Var.f = obj;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (!TextUtils.isEmpty(obj)) {
            l3Var.F(true);
            AndroidUtilities.runOnUIThread(a0Var, 1500L);
        } else {
            l3Var.c.clear();
            l3Var.F(false);
            l3Var.l();
        }
    }
}
