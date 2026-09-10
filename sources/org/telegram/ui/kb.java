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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class kb extends tb {
    public final gh.l x0;
    public final /* synthetic */ wb y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(wb wbVar, Context context) {
        super(wbVar, context);
        this.y0 = wbVar;
        this.x0 = new gh.l();
    }

    @Override // org.telegram.ui.Components.aw0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.lc0) {
            ((org.telegram.ui.Components.lc0) drawable).p();
        }
        gh.l lVar = this.x0;
        eh.a c10 = lVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(lVar.a(c10));
        wb wbVar = this.y0;
        wbVar.a.a = c10;
        ih.f fVar = wbVar.a0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.m mVar = com.google.firebase.messaging.m.e;
        if (mVar == null || !mVar.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        s4 s4Var = (s4) com.google.firebase.messaging.m.k().d;
        if (s4Var == null) {
            return true;
        }
        s4Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.Components.aw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0) {
            return;
        }
        long dialogId = playingMessageObject.getDialogId();
        wb wbVar = this.y0;
        if (dialogId == (-wbVar.s.id)) {
            MediaController.getInstance().setTextureView(wbVar.Q0(false), wbVar.i0, wbVar.h0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // org.telegram.ui.Components.aw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        int i20;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        org.telegram.ui.ActionBar.l lVar5;
        org.telegram.ui.ActionBar.l lVar6;
        int childCount = getChildCount();
        int i21 = 0;
        while (true) {
            wb wbVar = this.y0;
            if (i21 >= childCount) {
                wbVar.d1();
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
                            lVar4 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                            if (childAt != lVar4) {
                                lVar5 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                                if (lVar5.getVisibility() == 0) {
                                    lVar6 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                                    i19 += lVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = (i13 - i11) - measuredHeight;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt == wbVar.L) {
                            int dp = AndroidUtilities.dp(24.0f);
                            lVar2 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                            if (lVar2.getVisibility() == 0) {
                                lVar3 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                                i20 = lVar3.getMeasuredHeight() / 2;
                            } else {
                                i20 = 0;
                            }
                            i19 -= dp - i20;
                        } else {
                            lVar = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                            if (childAt == lVar) {
                                i19 -= getPaddingTop();
                            } else if (childAt == this.L || childAt == wbVar.a0) {
                                i19 = 0;
                            } else if (childAt == wbVar.E) {
                                i19 = -wbVar.r;
                            }
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt == wbVar.L) {
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
                if (childAt == wbVar.L) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
            }
            i21++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        org.telegram.ui.ActionBar.l lVar4;
        wb wbVar = this.y0;
        wbVar.T0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        eh.a aVar = wbVar.a.a;
        if (aVar instanceof eh.b) {
            ((eh.b) aVar).c(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar4 = ((org.telegram.ui.ActionBar.p2) wbVar).actionBar;
                if (childAt != lVar4) {
                    if (childAt == wbVar.E || childAt == wbVar.w) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (wbVar.r * 2), TLObject.FLAG_30));
                    } else if (childAt == wbVar.L) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                }
            }
        }
    }
}
