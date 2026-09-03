package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class gb extends pb {
    public final vg.j u0;
    public final /* synthetic */ sb v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(sb sbVar, Context context) {
        super(sbVar, context);
        this.v0 = sbVar;
        this.u0 = new vg.j();
    }

    @Override // org.telegram.ui.Components.pv0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.fc0) {
            ((org.telegram.ui.Components.fc0) drawable).p();
        }
        vg.j jVar = this.u0;
        tg.a c3 = jVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(jVar.a(c3));
        sb sbVar = this.v0;
        sbVar.a.a = c3;
        xg.f fVar = sbVar.X;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        cb.m mVar = cb.m.e;
        if (mVar == null || !mVar.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        u4 u4Var = (u4) cb.m.l().d;
        if (u4Var == null) {
            return true;
        }
        u4Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0) {
            return;
        }
        long dialogId = playingMessageObject.getDialogId();
        sb sbVar = this.v0;
        if (dialogId == (-sbVar.s.id)) {
            MediaController.getInstance().setTextureView(sbVar.Q0(false), sbVar.f0, sbVar.e0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i20;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        int childCount = getChildCount();
        int i21 = 0;
        while (true) {
            sb sbVar = this.v0;
            if (i21 >= childCount) {
                sbVar.d1();
                S();
                return;
            }
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i22 = layoutParams.gravity;
                if (i22 == -1) {
                    i22 = 51;
                }
                int i23 = i22 & 112;
                int i24 = i22 & 7;
                if (i24 == 1) {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i24 != 5) {
                    i16 = layoutParams.leftMargin;
                    if (i23 == 16) {
                        if (i23 == 48) {
                            i19 = layoutParams.topMargin + getPaddingTop();
                            kVar4 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                            if (childAt != kVar4) {
                                kVar5 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                                if (kVar5.getVisibility() == 0) {
                                    kVar6 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                                    i19 += kVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = (i13 - i11) - measuredHeight;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt == sbVar.I) {
                            int dp = AndroidUtilities.dp(24.0f);
                            kVar2 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                            if (kVar2.getVisibility() == 0) {
                                kVar3 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                                i20 = kVar3.getMeasuredHeight() / 2;
                            } else {
                                i20 = 0;
                            }
                            i19 -= dp - i20;
                        } else {
                            kVar = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                            if (childAt == kVar) {
                                i19 -= getPaddingTop();
                            } else if (childAt == this.I || childAt == sbVar.X) {
                                i19 = 0;
                            } else if (childAt == sbVar.B) {
                                i19 = -sbVar.r;
                            }
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt == sbVar.I) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                } else {
                    i14 = i12 - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                i16 = i14 - i15;
                if (i23 == 16) {
                }
                i19 = i17 - i18;
                if (childAt == sbVar.I) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
            i21++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        sb sbVar = this.v0;
        sbVar.Q0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        tg.a aVar = sbVar.a.a;
        if (aVar instanceof tg.b) {
            ((tg.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        measureChildWithMargins(kVar, i10, 0, i11, 0);
        kVar2 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt == sbVar.B || childAt == sbVar.w) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (sbVar.r * 2), TLObject.FLAG_30));
                    } else if (childAt == sbVar.I) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                }
            }
        }
    }
}
