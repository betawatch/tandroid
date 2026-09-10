package bi;

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
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class v3 extends org.telegram.ui.ActionBar.i5 {
    public AnimatorSet f;
    public final /* synthetic */ p4 h;

    public v3(p4 p4Var) {
        this.h = p4Var;
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void m() {
        p4 p4Var = this.h;
        w3 w3Var = p4Var.d;
        c4 c4Var = p4Var.F;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        c4Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i11 = 1;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = p4Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        w3Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(w3Var, (Property<w3, Float>) property3, 1.0f));
        w3Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(p4Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t3(this, i11));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(wr.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new u3(i10, this, searchField));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void n() {
        p4 p4Var = this.h;
        w3 w3Var = p4Var.d;
        FrameLayout frameLayout = p4Var.h;
        c4 c4Var = p4Var.F;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(c4Var, (Property<c4, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = p4Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(w3Var, (Property<w3, Float>) property3, 0.0f));
        w3Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        p4Var.s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new t3(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(wr.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new h(this, 2));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.i5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        d4 d4Var = this.h.r;
        a3.d dVar = d4Var.v;
        if (!TextUtils.equals(d4Var.f, obj)) {
            if (d4Var.e != -1) {
                ConnectionsManager.getInstance(d4Var.w.a).cancelRequest(d4Var.e, true);
                d4Var.e = -1;
            }
            d4Var.d = false;
            d4Var.h = null;
        }
        d4Var.f = obj;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        if (!TextUtils.isEmpty(obj)) {
            d4Var.F(true);
            AndroidUtilities.runOnUIThread(dVar, 1500L);
        } else {
            d4Var.c.clear();
            d4Var.F(false);
            d4Var.l();
        }
    }
}
