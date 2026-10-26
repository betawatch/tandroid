package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ho extends li {
    public final uz n;
    public final mm0 r;
    public final int s;
    public final org.telegram.ui.c8 v;
    public int w;

    public ho(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(context, u6Var, tiVar);
        this.s = i10;
        uz uzVar = new uz(context, u6Var);
        this.n = uzVar;
        uzVar.setText(LocaleController.getString(R.string.NoPhotos));
        uzVar.setOnTouchListener(null);
        uzVar.setTextSize(16);
        addView(uzVar, gb1.g(-2.0f, -1));
        uzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat p12 = this.b.p1();
        if (i10 == 1) {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 7));
        } else if (i10 == 3) {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 18));
        } else if (i10 == 4) {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 19));
        } else {
            uzVar.setText(ChatObject.getRestrictedErrorText(p12, 22));
        }
        uzVar.c();
        mm0 mm0Var = new mm0(context, u6Var);
        this.r = mm0Var;
        mm0Var.setSectionsType(2);
        mm0Var.setVerticalScrollBarEnabled(false);
        mm0Var.setLayoutManager(new s4.c0());
        mm0Var.setClipToPadding(false);
        org.telegram.ui.c8 c8Var = new org.telegram.ui.c8(this, 4);
        this.v = c8Var;
        mm0Var.setAdapter(c8Var);
        mm0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        mm0Var.setOnScrollListener(new ml(this, 2));
        addView(mm0Var, gb1.g(-1.0f, -1));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.li
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(int i10, int i11) {
        int i12;
        int i13;
        mm0 mm0Var;
        int max = Math.max(0, i11 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        if (this.w != max) {
            this.w = max;
            this.v.l();
        }
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                i12 = (int) (i11 / 3.5f);
                int dp = i12 - AndroidUtilities.dp(52.0f);
                i13 = dp >= 0 ? dp : 0;
                mm0Var = this.r;
                if (mm0Var.getPaddingTop() == i13) {
                    mm0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        mm0Var = this.r;
        if (mm0Var.getPaddingTop() == i13) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        mm0 mm0Var = this.r;
        if (mm0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = mm0Var.getChildAt(0);
        vl0 vl0Var = (vl0) mm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && vl0Var != null && vl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || vl0Var == null || vl0Var.b() != 0) {
            top = i10;
        }
        int measuredHeight = (getMeasuredHeight() - top) - AndroidUtilities.dp(50.0f);
        this.n.setTranslationY(((measuredHeight - r1.getMeasuredHeight()) / 2) + top);
        return AndroidUtilities.dp(12.0f) + top;
    }

    @Override // org.telegram.ui.Components.li
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override // org.telegram.ui.Components.li
    public int getListTopPadding() {
        return this.r.getPaddingTop();
    }

    @Override // android.view.View
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.b.getSheetContainer().invalidate();
    }
}
