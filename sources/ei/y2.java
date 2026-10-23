package ei;

import ai.me;
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
import org.telegram.ui.Components.bs;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final class y2 extends org.telegram.ui.ActionBar.g5 {
    public AnimatorSet r;
    public final /* synthetic */ q3 s;

    public y2(q3 q3Var) {
        this.s = q3Var;
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void m() {
        q3 q3Var = this.s;
        z2 z2Var = q3Var.d;
        f3 f3Var = q3Var.F;
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        f3Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, (Property<f3, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, (Property<f3, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, (Property<f3, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = q3Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        z2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(z2Var, (Property<z2, Float>) property3, 1.0f));
        z2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(q3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.setDuration(320L);
        this.r.setInterpolator(bs.h);
        this.r.playTogether(arrayList);
        this.r.addListener(new me(3, this, searchField));
        this.r.start();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void n() {
        q3 q3Var = this.s;
        z2 z2Var = q3Var.d;
        FrameLayout frameLayout = q3Var.h;
        f3 f3Var = q3Var.F;
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, (Property<f3, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, (Property<f3, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(f3Var, (Property<f3, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = q3Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(z2Var, (Property<z2, Float>) property3, 0.0f));
        z2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        q3Var.s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new x2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        animatorSet2.setDuration(320L);
        this.r.setInterpolator(bs.h);
        this.r.playTogether(arrayList);
        this.r.addListener(new ah.b(this, 18));
        this.r.start();
    }

    @Override // org.telegram.ui.ActionBar.g5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        g3 g3Var = this.s.r;
        com.google.firebase.messaging.s sVar = g3Var.v;
        if (!TextUtils.equals(g3Var.f, obj)) {
            if (g3Var.e != -1) {
                ConnectionsManager.getInstance(g3Var.w.a).cancelRequest(g3Var.e, true);
                g3Var.e = -1;
            }
            g3Var.d = false;
            g3Var.h = null;
        }
        g3Var.f = obj;
        AndroidUtilities.cancelRunOnUIThread(sVar);
        if (!TextUtils.isEmpty(obj)) {
            g3Var.F(true);
            AndroidUtilities.runOnUIThread(sVar, 1500L);
        } else {
            g3Var.c.clear();
            g3Var.F(false);
            g3Var.l();
        }
    }
}
