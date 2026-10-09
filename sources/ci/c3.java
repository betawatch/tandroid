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
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class c3 extends org.telegram.ui.ActionBar.g5 {
    public AnimatorSet f;
    public final /* synthetic */ v3 h;

    public c3(v3 v3Var) {
        this.h = v3Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        v3 v3Var = this.h;
        d3 d3Var = v3Var.d;
        j3 j3Var = v3Var.F;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        j3Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, (Property<j3, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, (Property<j3, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, (Property<j3, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = v3Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        d3Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property3, 1.0f));
        d3Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(v3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(hs.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new ai.z(2, this, searchField));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        v3 v3Var = this.h;
        d3 d3Var = v3Var.d;
        FrameLayout frameLayout = v3Var.h;
        j3 j3Var = v3Var.F;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, (Property<j3, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, (Property<j3, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(j3Var, (Property<j3, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = v3Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property3, 0.0f));
        d3Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        v3Var.s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b3(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(hs.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new ai.b(this, 13));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        k3 k3Var = this.h.r;
        androidx.fragment.app.a0 a0Var = k3Var.v;
        if (!TextUtils.equals(k3Var.f, obj)) {
            if (k3Var.e != -1) {
                ConnectionsManager.getInstance(k3Var.w.a).cancelRequest(k3Var.e, true);
                k3Var.e = -1;
            }
            k3Var.d = false;
            k3Var.h = null;
        }
        k3Var.f = obj;
        AndroidUtilities.cancelRunOnUIThread(a0Var);
        if (!TextUtils.isEmpty(obj)) {
            k3Var.F(true);
            AndroidUtilities.runOnUIThread(a0Var, 1500L);
        } else {
            k3Var.c.clear();
            k3Var.F(false);
            k3Var.l();
        }
    }
}
