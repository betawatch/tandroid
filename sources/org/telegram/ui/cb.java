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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cb extends lb {
    public final sg.k t0;
    public final /* synthetic */ ob u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(ob obVar, Context context) {
        super(obVar, context);
        this.u0 = obVar;
        this.t0 = new sg.k();
    }

    @Override // org.telegram.ui.Components.hv0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.yb0) {
            ((org.telegram.ui.Components.yb0) drawable).p();
        }
        sg.k kVar = this.t0;
        qg.a c3 = kVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(kVar.a(c3));
        ob obVar = this.u0;
        obVar.a.a = c3;
        ug.f fVar = obVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ab.m mVar = ab.m.e;
        if (mVar == null || !mVar.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        s4 s4Var = (s4) ab.m.i().d;
        if (s4Var == null) {
            return true;
        }
        s4Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0) {
            return;
        }
        long dialogId = playingMessageObject.getDialogId();
        ob obVar = this.u0;
        if (dialogId == (-obVar.s.id)) {
            MediaController.getInstance().setTextureView(obVar.Q0(false), obVar.e0, obVar.d0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
            ob obVar = this.u0;
            if (i21 >= childCount) {
                obVar.d1();
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
                            lVar4 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                            if (childAt != lVar4) {
                                lVar5 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                                if (lVar5.getVisibility() == 0) {
                                    lVar6 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                                    i19 += lVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i23 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = (i13 - i11) - measuredHeight;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt == obVar.H) {
                            int dp = AndroidUtilities.dp(24.0f);
                            lVar2 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                            if (lVar2.getVisibility() == 0) {
                                lVar3 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                                i20 = lVar3.getMeasuredHeight() / 2;
                            } else {
                                i20 = 0;
                            }
                            i19 -= dp - i20;
                        } else {
                            lVar = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                            if (childAt == lVar) {
                                i19 -= getPaddingTop();
                            } else if (childAt == this.H || childAt == obVar.W) {
                                i19 = 0;
                            } else if (childAt == obVar.A) {
                                i19 = -obVar.r;
                            }
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight + i19);
                    } else {
                        i17 = (((i13 - i11) - measuredHeight) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt == obVar.H) {
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
                if (childAt == obVar.H) {
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
        ob obVar = this.u0;
        obVar.P0.a();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        qg.a aVar = obVar.a.a;
        if (aVar instanceof qg.b) {
            ((qg.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        lVar = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        measureChildWithMargins(lVar, i10, 0, i11, 0);
        lVar2 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        int measuredHeight = lVar2.getMeasuredHeight();
        lVar3 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        if (lVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null && childAt.getVisibility() != 8) {
                lVar4 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
                if (childAt != lVar4) {
                    if (childAt == obVar.A || childAt == obVar.w) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i11)) + (obVar.r * 2), TLObject.FLAG_30));
                    } else if (childAt == obVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i10, 0, i11, 0);
                    }
                }
            }
        }
    }
}
