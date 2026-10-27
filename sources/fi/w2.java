package fi;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import bi.ce;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ds;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class w2 extends org.telegram.ui.ActionBar.s0 {
    public AnimatorSet a;
    public final /* synthetic */ o3 b;

    public w2(o3 o3Var) {
        this.b = o3Var;
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void h() {
        o3 o3Var = this.b;
        x2 x2Var = o3Var.d;
        d3 d3Var = o3Var.F;
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        d3Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = o3Var.G.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        x2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(x2Var, (Property<x2, Float>) property3, 1.0f));
        x2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(o3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new v2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.setDuration(320L);
        this.a.setInterpolator(ds.h);
        this.a.playTogether(arrayList);
        this.a.addListener(new ce(3, this, searchField));
        this.a.start();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void i() {
        o3 o3Var = this.b;
        x2 x2Var = o3Var.d;
        FrameLayout frameLayout = o3Var.h;
        d3 d3Var = o3Var.F;
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(d3Var, (Property<d3, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = o3Var.G.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(x2Var, (Property<x2, Float>) property3, 0.0f));
        x2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        o3Var.s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new v2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.a = animatorSet2;
        animatorSet2.setDuration(320L);
        this.a.setInterpolator(ds.h);
        this.a.playTogether(arrayList);
        this.a.addListener(new bh.b(this, 19));
        this.a.start();
    }

    @Override // org.telegram.ui.ActionBar.s0
    public final void l(EditText editText) {
        String obj = editText.getText().toString();
        e3 e3Var = this.b.r;
        di.s8 s8Var = e3Var.v;
        if (!TextUtils.equals(e3Var.f, obj)) {
            if (e3Var.e != -1) {
                ConnectionsManager.getInstance(e3Var.w.a).cancelRequest(e3Var.e, true);
                e3Var.e = -1;
            }
            e3Var.d = false;
            e3Var.h = null;
        }
        e3Var.f = obj;
        AndroidUtilities.cancelRunOnUIThread(s8Var);
        if (!TextUtils.isEmpty(obj)) {
            e3Var.F(true);
            AndroidUtilities.runOnUIThread(s8Var, 1500L);
        } else {
            e3Var.c.clear();
            e3Var.F(false);
            e3Var.l();
        }
    }
}
