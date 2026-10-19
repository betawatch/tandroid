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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class go extends li {
    public final vz n;
    public final im0 r;
    public final int s;
    public final org.telegram.ui.z7 v;
    public int w;

    public go(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(context, d6Var, tiVar);
        this.s = i10;
        vz vzVar = new vz(context, d6Var);
        this.n = vzVar;
        vzVar.setText(LocaleController.getString(R.string.NoPhotos));
        vzVar.setOnTouchListener(null);
        vzVar.setTextSize(16);
        addView(vzVar, w7.z5.c(-2.0f, -1));
        vzVar.a(R.raw.media_forbidden, ImageReceiver.DEFAULT_CROSSFADE_DURATION, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
        TLRPC.Chat m12 = this.b.m1();
        if (i10 == 1) {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 7));
        } else if (i10 == 3) {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 18));
        } else if (i10 == 4) {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 19));
        } else {
            vzVar.setText(ChatObject.getRestrictedErrorText(m12, 22));
        }
        vzVar.c();
        im0 im0Var = new im0(context, d6Var);
        this.r = im0Var;
        im0Var.setSectionsType(2);
        im0Var.setVerticalScrollBarEnabled(false);
        im0Var.setLayoutManager(new s4.b0());
        im0Var.setClipToPadding(false);
        org.telegram.ui.z7 z7Var = new org.telegram.ui.z7(this, 4);
        this.v = z7Var;
        im0Var.setAdapter(z7Var);
        im0Var.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        im0Var.setOnScrollListener(new ah.d0(this, 28));
        addView(im0Var, w7.z5.c(-1.0f, -1));
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
        im0 im0Var;
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
                im0Var = this.r;
                if (im0Var.getPaddingTop() == i13) {
                    im0Var.setPadding(AndroidUtilities.dp(6.0f), i13, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(48.0f));
                    return;
                }
                return;
            }
        }
        i12 = (i11 / 5) * 2;
        int dp2 = i12 - AndroidUtilities.dp(52.0f);
        if (dp2 >= 0) {
        }
        im0Var = this.r;
        if (im0Var.getPaddingTop() == i13) {
        }
    }

    @Override // org.telegram.ui.Components.li
    public int getCurrentItemTop() {
        im0 im0Var = this.r;
        if (im0Var.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        int i10 = 0;
        View childAt = im0Var.getChildAt(0);
        sl0 sl0Var = (sl0) im0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        if (top > 0 && sl0Var != null && sl0Var.b() == 0) {
            i10 = top;
        }
        if (top < 0 || sl0Var == null || sl0Var.b() != 0) {
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
