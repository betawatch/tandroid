package lh;

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
import org.telegram.ui.Components.er;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x2 extends org.telegram.ui.ActionBar.e5 {
    public AnimatorSet f;
    public final /* synthetic */ p3 h;

    public x2(p3 p3Var) {
        this.h = p3Var;
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void m() {
        p3 p3Var = this.h;
        y2 y2Var = p3Var.d;
        e3 e3Var = p3Var.B;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        e3Var.setVisibility(0);
        Property property = View.SCALE_X;
        int i10 = 1;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property, 1.0f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property2, 1.0f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property3, 1.0f));
        EditTextBoldCursor searchField = p3Var.C.getSearchField();
        if (searchField != null) {
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
        }
        y2Var.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(y2Var, (Property<y2, Float>) property3, 1.0f));
        y2Var.setFastScrollVisible(true);
        arrayList.add(ObjectAnimator.ofFloat(p3Var.h, (Property<FrameLayout, Float>) property3, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new w2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(er.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new ag.x1(6, this, searchField));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void n() {
        p3 p3Var = this.h;
        y2 y2Var = p3Var.d;
        FrameLayout frameLayout = p3Var.h;
        e3 e3Var = p3Var.B;
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ArrayList arrayList = new ArrayList();
        Property property = View.SCALE_X;
        int i10 = 0;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property, 0.8f));
        Property property2 = View.SCALE_Y;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property2, 0.8f));
        Property property3 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(e3Var, (Property<e3, Float>) property3, 0.0f));
        EditTextBoldCursor searchField = p3Var.C.getSearchField();
        if (searchField != null) {
            searchField.setVisibility(0);
            searchField.setHandlesColor(-1);
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
        }
        frameLayout.setVisibility(0);
        arrayList.add(ObjectAnimator.ofFloat(y2Var, (Property<y2, Float>) property3, 0.0f));
        y2Var.setFastScrollVisible(false);
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
        p3Var.s.setVisibility(0);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new w2(this, i10));
        arrayList.add(ofFloat);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f = animatorSet2;
        animatorSet2.setDuration(320L);
        this.f.setInterpolator(er.h);
        this.f.playTogether(arrayList);
        this.f.addListener(new ag.r1(this, 24));
        this.f.start();
    }

    @Override // org.telegram.ui.ActionBar.e5
    public final void q(EditText editText) {
        String obj = editText.getText().toString();
        f3 f3Var = this.h.r;
        kh.c cVar = f3Var.v;
        if (!TextUtils.equals(f3Var.f, obj)) {
            if (f3Var.e != -1) {
                ConnectionsManager.getInstance(f3Var.w.a).cancelRequest(f3Var.e, true);
                f3Var.e = -1;
            }
            f3Var.d = false;
            f3Var.h = null;
        }
        f3Var.f = obj;
        AndroidUtilities.cancelRunOnUIThread(cVar);
        if (!TextUtils.isEmpty(obj)) {
            f3Var.F(true);
            AndroidUtilities.runOnUIThread(cVar, 1500L);
        } else {
            f3Var.c.clear();
            f3Var.F(false);
            f3Var.l();
        }
    }
}
