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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class db extends mb {
    public final pg.j t0;
    public final /* synthetic */ pb u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(pb pbVar, Context context) {
        super(pbVar, context);
        this.u0 = pbVar;
        this.t0 = new pg.j();
    }

    @Override // org.telegram.ui.Components.xu0
    public final void U(Drawable drawable) {
        if (drawable instanceof org.telegram.ui.Components.jb0) {
            ((org.telegram.ui.Components.jb0) drawable).p();
        }
        pg.j jVar = this.t0;
        ng.a c10 = jVar.c(drawable);
        AndroidUtilities.computePerceivedBrightness(jVar.a(c10));
        pb pbVar = this.u0;
        pbVar.a.a = c10;
        rg.f fVar = pbVar.W;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.google.firebase.messaging.l lVar = com.google.firebase.messaging.l.e;
        if (lVar == null || !lVar.a) {
            return super.dispatchTouchEvent(motionEvent);
        }
        r4 r4Var = (r4) com.google.firebase.messaging.l.i().d;
        if (r4Var == null) {
            return true;
        }
        r4Var.onTouchEvent(motionEvent);
        return true;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject == null || !playingMessageObject.isRoundVideo() || playingMessageObject.eventId == 0) {
            return;
        }
        long dialogId = playingMessageObject.getDialogId();
        pb pbVar = this.u0;
        if (dialogId == (-pbVar.s.id)) {
            MediaController.getInstance().setTextureView(pbVar.Q0(false), pbVar.e0, pbVar.d0, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        int i19;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        org.telegram.ui.ActionBar.k kVar5;
        org.telegram.ui.ActionBar.k kVar6;
        int childCount = getChildCount();
        int i20 = 0;
        while (true) {
            pb pbVar = this.u0;
            if (i20 >= childCount) {
                pbVar.d1();
                S();
                return;
            }
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 112;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i13 = (((i11 - i9) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i15 = layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i18 = layoutParams.topMargin + getPaddingTop();
                            kVar4 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                            if (childAt != kVar4) {
                                kVar5 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                                if (kVar5.getVisibility() == 0) {
                                    kVar6 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                                    i18 += kVar6.getMeasuredHeight();
                                }
                            }
                        } else if (i22 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = (i12 - i10) - measuredHeight;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (childAt == pbVar.H) {
                            int dp = AndroidUtilities.dp(24.0f);
                            kVar2 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                            if (kVar2.getVisibility() == 0) {
                                kVar3 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                                i19 = kVar3.getMeasuredHeight() / 2;
                            } else {
                                i19 = 0;
                            }
                            i18 -= dp - i19;
                        } else {
                            kVar = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                            if (childAt == kVar) {
                                i18 -= getPaddingTop();
                            } else if (childAt == this.H || childAt == pbVar.W) {
                                i18 = 0;
                            } else if (childAt == pbVar.A) {
                                i18 = -pbVar.r;
                            }
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                    } else {
                        i16 = (((i12 - i10) - measuredHeight) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (childAt == pbVar.H) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
                } else {
                    i13 = i11 - measuredWidth;
                    i14 = layoutParams.rightMargin;
                }
                i15 = i13 - i14;
                if (i22 == 16) {
                }
                i18 = i16 - i17;
                if (childAt == pbVar.H) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight + i18);
            }
            i20++;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        org.telegram.ui.ActionBar.k kVar4;
        pb pbVar = this.u0;
        pbVar.P0.a();
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        ng.a aVar = pbVar.a.a;
        if (aVar instanceof ng.b) {
            ((ng.b) aVar).b(size, size2);
        }
        setMeasuredDimension(size, size2);
        int paddingTop = size2 - getPaddingTop();
        kVar = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        measureChildWithMargins(kVar, i9, 0, i10, 0);
        kVar2 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        int measuredHeight = kVar2.getMeasuredHeight();
        kVar3 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        if (kVar3.getVisibility() == 0) {
            paddingTop -= measuredHeight;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt != null && childAt.getVisibility() != 8) {
                kVar4 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
                if (childAt != kVar4) {
                    if (childAt == pbVar.A || childAt == pbVar.w) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), View.MeasureSpec.getSize(i10)) + (pbVar.r * 2), TLObject.FLAG_30));
                    } else if (childAt == pbVar.H) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(paddingTop, TLObject.FLAG_30));
                    } else {
                        measureChildWithMargins(childAt, i9, 0, i10, 0);
                    }
                }
            }
        }
    }
}
