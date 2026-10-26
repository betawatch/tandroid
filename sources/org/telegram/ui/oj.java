package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class oj extends di.p5 {
    public final o1.j A3;
    public final ac.a B3;
    public final o1.j C3;
    public boolean D3;
    public final Path E3;
    public boolean F3;
    public int G3;
    public final /* synthetic */ un H3;
    public int h3;
    public final ArrayList i3;
    public final ArrayList j3;
    public final ArrayList k3;
    public final ArrayList l3;
    public final ArrayList m3;
    public int n3;
    public int o3;
    public int p3;
    public long q3;
    public float r3;
    public float s3;
    public boolean t3;
    public final float u3;
    public final Paint v3;
    public final Paint w3;
    public final ac.a x3;
    public final o1.j y3;
    public final ac.a z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj(un unVar, Context context, sn snVar) {
        super(unVar, context, snVar, 1);
        this.H3 = unVar;
        this.i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.k3 = new ArrayList();
        this.l3 = new ArrayList();
        this.m3 = new ArrayList(10);
        this.u3 = 2000.0f;
        Paint paint = new Paint(1);
        this.v3 = paint;
        Paint paint2 = new Paint(1);
        this.w3 = paint2;
        ac.a aVar = new ac.a(0.0f);
        this.x3 = aVar;
        o1.j jVar = new o1.j(aVar);
        jVar.h = 0.0f;
        jVar.g = 2000.0f;
        jVar.u = d3.l(0.0f, 1500.0f, 1.0f);
        final int i10 = 0;
        jVar.b(new o1.g(this) { // from class: org.telegram.ui.nj
            public final /* synthetic */ oj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i10) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.y3 = jVar;
        ac.a aVar2 = new ac.a(0.0f);
        this.z3 = aVar2;
        o1.j jVar2 = new o1.j(aVar2);
        jVar2.h = 0.0f;
        jVar2.u = d3.l(0.0f, 400.0f, 0.5f);
        final int i11 = 1;
        jVar2.b(new o1.g(this) { // from class: org.telegram.ui.nj
            public final /* synthetic */ oj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i11) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.A3 = jVar2;
        ac.a aVar3 = new ac.a(0.0f);
        this.B3 = aVar3;
        o1.j jVar3 = new o1.j(aVar3);
        jVar3.h = 0.0f;
        jVar3.u = d3.l(0.0f, 200.0f, 1.0f);
        final int i12 = 2;
        jVar3.b(new o1.g(this) { // from class: org.telegram.ui.nj
            public final /* synthetic */ oj b;

            {
                this.b = this;
            }

            @Override // o1.g
            public final void a(o1.h hVar, float f7, float f10) {
                switch (i12) {
                    case 0:
                        this.b.invalidate();
                        break;
                    case 1:
                        this.b.invalidate();
                        break;
                    default:
                        this.b.invalidate();
                        break;
                }
            }
        });
        this.C3 = jVar3;
        this.E3 = new Path();
        this.G3 = 0;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x03bf, code lost:
    
        if (r2.messages.size() != 1) goto L155;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C1(Canvas canvas, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        un unVar;
        float f11;
        int i12;
        float f12;
        int i13;
        int i14;
        float f13;
        boolean z10;
        int i15;
        MessageObject.GroupedMessages currentMessagesGroup;
        int i16;
        boolean z11;
        org.telegram.ui.ActionBar.k kVar;
        int measuredHeight;
        int i17;
        int i18;
        org.telegram.ui.ActionBar.k kVar2;
        int measuredHeight2;
        oj ojVar = this;
        Canvas canvas2 = canvas;
        int childCount = ojVar.getChildCount();
        MessageObject.GroupedMessages groupedMessages = null;
        int i19 = 0;
        while (true) {
            i10 = 8;
            i11 = 2;
            f7 = 0.0f;
            f10 = 2.0f;
            unVar = ojVar.H3;
            if (i19 >= childCount) {
                f11 = 1.0f;
                break;
            }
            View childAt = ojVar.getChildAt(i19);
            f11 = 1.0f;
            if (childAt.getVisibility() != 4 && childAt.getVisibility() != 8) {
                if (!un.g2(unVar, childAt, rectF)) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        canvas2.save();
                        canvas2.translate(childAt.getX(), childAt.getY());
                        ((org.telegram.ui.Cells.t1) childAt).a(canvas2);
                        canvas2.restore();
                    } else if (unVar.A0.n && (childAt instanceof org.telegram.ui.Cells.g0)) {
                        float measuredHeight3 = ((((ojVar.getMeasuredHeight() - unVar.E9) - unVar.Na) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + unVar.E9;
                        if (!((org.telegram.ui.Cells.g0) childAt).I && !unVar.x0.V1) {
                            if (childAt.getTop() > measuredHeight3) {
                                childAt.setTranslationY(measuredHeight3 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.cb) {
                        float measuredHeight4 = ((((ojVar.getMeasuredHeight() - unVar.E9) - unVar.Na) / 2.0f) - (childAt.getMeasuredHeight() / 2)) + unVar.E9;
                        if (!((org.telegram.ui.Cells.cb) childAt).N && !unVar.x0.V1) {
                            if (childAt.getTop() > measuredHeight4) {
                                childAt.setTranslationY(measuredHeight4 - childAt.getTop());
                            } else {
                                childAt.setTranslationY(0.0f);
                            }
                        }
                    } else {
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                            MessageObject.GroupedMessages currentMessagesGroup2 = s1Var.getCurrentMessagesGroup();
                            if (currentMessagesGroup2 == null || currentMessagesGroup2 != groupedMessages) {
                                MessageObject.GroupedMessagePosition currentPosition = s1Var.getCurrentPosition();
                                org.telegram.ui.Components.ib0 backgroundDrawable = s1Var.getBackgroundDrawable();
                                if ((backgroundDrawable.f || s1Var.g3()) && (currentPosition == null || (2 & currentPosition.flags) != 0)) {
                                    boolean z12 = s1Var.f8;
                                    org.telegram.ui.ActionBar.u6 u6Var = ojVar.n2;
                                    z11 = true;
                                    if (z12 || s1Var.g8) {
                                        i16 = i19;
                                        if (currentPosition == null) {
                                            Paint X0 = ojVar.X0("paintChatMessageBackgroundSelected");
                                            sn snVar = unVar.qa;
                                            if ((snVar == null || !snVar.q) && X0 != null) {
                                                if (unVar.F9()) {
                                                    measuredHeight = unVar.x0.getTop();
                                                } else {
                                                    kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                                                    measuredHeight = kVar.getMeasuredHeight();
                                                }
                                                float backgroundTranslationY = measuredHeight - unVar.j1.getBackgroundTranslationY();
                                                int backgroundSizeY = unVar.j1.getBackgroundSizeY();
                                                sn snVar2 = unVar.qa;
                                                if (snVar2 != null) {
                                                    snVar2.b(s1Var.getX(), backgroundTranslationY, ojVar.getMeasuredWidth(), backgroundSizeY);
                                                } else {
                                                    org.telegram.ui.ActionBar.y6.q(s1Var.getX(), backgroundTranslationY, ojVar.getMeasuredWidth(), backgroundSizeY);
                                                }
                                            } else {
                                                X0 = org.telegram.ui.ActionBar.y6.a2;
                                                X0.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hc, u6Var));
                                            }
                                            Paint paint = X0;
                                            canvas2.save();
                                            canvas2.translate(0.0f, s1Var.getTranslationY());
                                            int alpha = paint.getAlpha();
                                            paint.setAlpha((int) (s1Var.getAlpha() * s1Var.getHighlightAlpha() * alpha));
                                            canvas2.drawRect(0.0f, s1Var.getTop(), ojVar.getMeasuredWidth(), s1Var.getBottom(), paint);
                                            paint.setAlpha(alpha);
                                            canvas2.restore();
                                        }
                                    } else {
                                        int y3 = (int) s1Var.getY();
                                        canvas2.save();
                                        if (currentPosition == null) {
                                            i17 = s1Var.getMeasuredHeight();
                                            i16 = i19;
                                        } else {
                                            int measuredHeight5 = s1Var.getMeasuredHeight() + y3;
                                            long j10 = 0;
                                            float f14 = 0.0f;
                                            int i20 = 0;
                                            while (i20 < childCount) {
                                                View childAt2 = ojVar.getChildAt(i20);
                                                int i21 = i19;
                                                if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt2;
                                                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup2) {
                                                        org.telegram.ui.Components.ib0 backgroundDrawable2 = s1Var2.getBackgroundDrawable();
                                                        i18 = i20;
                                                        y3 = Math.min(y3, (int) s1Var2.getY());
                                                        measuredHeight5 = Math.max(measuredHeight5, s1Var2.getMeasuredHeight() + ((int) s1Var2.getY()));
                                                        long j11 = backgroundDrawable2.l;
                                                        if (j11 > j10) {
                                                            j10 = j11;
                                                            f7 = s1Var2.getX() + backgroundDrawable2.h;
                                                            f14 = s1Var2.getY() + backgroundDrawable2.i;
                                                        }
                                                        i20 = i18 + 1;
                                                        i19 = i21;
                                                    }
                                                }
                                                i18 = i20;
                                                i20 = i18 + 1;
                                                i19 = i21;
                                            }
                                            i16 = i19;
                                            backgroundDrawable.j = f7;
                                            backgroundDrawable.k = f14 - y3;
                                            i17 = measuredHeight5 - y3;
                                        }
                                        int i22 = i17 + y3;
                                        canvas2.clipRect(0, y3, ojVar.getMeasuredWidth(), i22);
                                        Paint X02 = ojVar.X0("paintChatMessageBackgroundSelected");
                                        sn snVar3 = unVar.qa;
                                        if (snVar3 == null || snVar3.q || X02 == null) {
                                            backgroundDrawable.b = null;
                                            backgroundDrawable.a.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hc, u6Var));
                                        } else {
                                            backgroundDrawable.b = X02;
                                            if (unVar.F9()) {
                                                measuredHeight2 = unVar.x0.getTop();
                                            } else {
                                                kVar2 = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
                                                measuredHeight2 = kVar2.getMeasuredHeight();
                                            }
                                            float backgroundTranslationY2 = measuredHeight2 - unVar.j1.getBackgroundTranslationY();
                                            int backgroundSizeY2 = unVar.j1.getBackgroundSizeY();
                                            sn snVar4 = unVar.qa;
                                            if (snVar4 != null) {
                                                snVar4.b(s1Var.getX(), backgroundTranslationY2, ojVar.getMeasuredWidth(), backgroundSizeY2);
                                            } else {
                                                org.telegram.ui.ActionBar.y6.q(s1Var.getX(), backgroundTranslationY2, ojVar.getMeasuredWidth(), backgroundSizeY2);
                                            }
                                        }
                                        backgroundDrawable.setBounds(0, y3, ojVar.getMeasuredWidth(), i22);
                                        backgroundDrawable.draw(canvas2);
                                        canvas2.restore();
                                    }
                                } else {
                                    i16 = i19;
                                    z11 = true;
                                }
                                groupedMessages = currentMessagesGroup2;
                            } else {
                                i16 = i19;
                                z11 = true;
                            }
                            if (unVar.V8 != s1Var && currentMessagesGroup2 == null && s1Var.C1()) {
                                canvas2.save();
                                canvas2.translate(s1Var.getX(), s1Var.getY() + s1Var.getPaddingTop());
                                if (s1Var.getScaleX() != 1.0f) {
                                    canvas2.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX(), s1Var.getHeight() >> 1);
                                }
                                s1Var.D1(canvas2, z11, false);
                                canvas2.restore();
                            }
                        } else {
                            i16 = i19;
                            if (childAt instanceof org.telegram.ui.Cells.v0) {
                                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                                if (v0Var.J()) {
                                    canvas2.save();
                                    canvas2.translate(v0Var.getX(), v0Var.getY() + v0Var.getPaddingTop());
                                    canvas2.scale(v0Var.getScaleX(), v0Var.getScaleY(), v0Var.getMeasuredWidth() / 2.0f, v0Var.getMeasuredHeight() / 2.0f);
                                    canvas2.translate(unVar.b9() / 2.0f, 0.0f);
                                    v0Var.y(canvas2, true);
                                    v0Var.B(canvas2, true);
                                    canvas2.restore();
                                }
                            }
                        }
                        i19 = i16 + 1;
                    }
                }
            }
            i16 = i19;
            i19 = i16 + 1;
        }
        View view = unVar.V8;
        MessageObject.GroupedMessages currentMessagesGroup3 = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getCurrentMessagesGroup() : null;
        int i23 = 0;
        while (i23 < 3) {
            ArrayList arrayList = ojVar.m3;
            arrayList.clear();
            if (i23 != i11 || unVar.x0.V1) {
                int i24 = 0;
                while (i24 < childCount) {
                    View childAt3 = unVar.x0.getChildAt(i24);
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) childAt3;
                        if (childAt3.getY() <= unVar.x0.getHeight() && childAt3.getY() + childAt3.getHeight() >= f7 && s1Var3.getVisibility() != i10 && (currentMessagesGroup = s1Var3.getCurrentMessagesGroup()) != null) {
                            int i25 = i23 == 0 ? 1 : 1;
                            if ((i23 != i25 || currentMessagesGroup.transitionParams.drawBackgroundForDeletedItems) && ((i23 != 0 || !s1Var3.getMessageObject().deleted) && ((i23 != 1 || s1Var3.getMessageObject().deleted) && ((i23 != i11 || s1Var3.oc) && (i23 == i11 || !s1Var3.oc))))) {
                                if (!arrayList.contains(currentMessagesGroup)) {
                                    MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                                    transitionParams.left = 0;
                                    transitionParams.top = 0;
                                    transitionParams.right = 0;
                                    transitionParams.bottom = 0;
                                    transitionParams.pinnedBotton = false;
                                    transitionParams.pinnedTop = false;
                                    transitionParams.cell = s1Var3;
                                    arrayList.add(currentMessagesGroup);
                                }
                                i15 = i10;
                                currentMessagesGroup.transitionParams.pinnedTop = s1Var3.n3();
                                currentMessagesGroup.transitionParams.pinnedBotton = s1Var3.m3();
                                int backgroundDrawableLeft = s1Var3.getBackgroundDrawableLeft() + s1Var3.getLeft();
                                int backgroundDrawableRight = s1Var3.getBackgroundDrawableRight() + s1Var3.getLeft();
                                int backgroundDrawableTop = s1Var3.getBackgroundDrawableTop() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                int backgroundDrawableBottom = s1Var3.getBackgroundDrawableBottom() + s1Var3.getPaddingTop() + s1Var3.getTop();
                                if ((s1Var3.getCurrentPosition().flags & 4) == 0) {
                                    backgroundDrawableTop -= AndroidUtilities.dp(10.0f);
                                }
                                int i26 = backgroundDrawableTop;
                                if ((s1Var3.getCurrentPosition().flags & 8) == 0) {
                                    backgroundDrawableBottom = AndroidUtilities.dp(10.0f) + backgroundDrawableBottom;
                                }
                                int i27 = backgroundDrawableBottom;
                                if (s1Var3.oc) {
                                    currentMessagesGroup.transitionParams.cell = s1Var3;
                                }
                                MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup.transitionParams;
                                int i28 = transitionParams2.top;
                                if (i28 == 0 || i26 < i28) {
                                    transitionParams2.top = i26;
                                }
                                int i29 = transitionParams2.bottom;
                                if (i29 == 0 || i27 > i29) {
                                    transitionParams2.bottom = i27;
                                }
                                int i30 = transitionParams2.left;
                                if (i30 == 0 || backgroundDrawableLeft < i30) {
                                    transitionParams2.left = backgroundDrawableLeft;
                                }
                                int i31 = transitionParams2.right;
                                if (i31 == 0 || backgroundDrawableRight > i31) {
                                    transitionParams2.right = backgroundDrawableRight;
                                }
                                i24++;
                                i10 = i15;
                                i11 = 2;
                                f7 = 0.0f;
                            }
                        }
                    }
                    i15 = i10;
                    i24++;
                    i10 = i15;
                    i11 = 2;
                    f7 = 0.0f;
                }
                i12 = i10;
                int i32 = 0;
                while (i32 < arrayList.size()) {
                    MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) arrayList.get(i32);
                    float E2 = groupedMessages2.transitionParams.cell.E2(true);
                    MessageObject.GroupedMessages.TransitionParams transitionParams3 = groupedMessages2.transitionParams;
                    float f15 = transitionParams3.left + E2 + transitionParams3.offsetLeft;
                    float f16 = transitionParams3.top + transitionParams3.offsetTop;
                    float f17 = transitionParams3.offsetRight + transitionParams3.right + E2;
                    float f18 = transitionParams3.bottom + transitionParams3.offsetBottom;
                    if (!transitionParams3.backgroundChangeBounds) {
                        f16 += transitionParams3.cell.getTranslationY();
                        f18 += groupedMessages2.transitionParams.cell.getTranslationY();
                    }
                    float f19 = f16;
                    if (f18 > AndroidUtilities.dp(20.0f) + unVar.x0.getMeasuredHeight()) {
                        f18 = AndroidUtilities.dp(20.0f) + unVar.x0.getMeasuredHeight();
                    }
                    float f20 = f18;
                    boolean z13 = (groupedMessages2.transitionParams.cell.getScaleX() == f11 && groupedMessages2.transitionParams.cell.getScaleY() == f11) ? false : true;
                    if (z13) {
                        canvas2.save();
                        i14 = i23;
                        canvas2.scale(groupedMessages2.transitionParams.cell.getScaleX(), groupedMessages2.transitionParams.cell.getScaleY(), c3.h0.B(f17, f15, f10, f15), c3.h0.B(f20, f19, f10, f19));
                    } else {
                        i14 = i23;
                    }
                    int size = groupedMessages2.messages.size();
                    int i33 = 0;
                    while (true) {
                        if (i33 >= size) {
                            f13 = f20;
                            z10 = true;
                            break;
                        }
                        MessageObject messageObject = groupedMessages2.messages.get(i33);
                        f13 = f20;
                        if (unVar.i6[messageObject.getDialogId() == unVar.f6 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) < 0) {
                            z10 = false;
                            break;
                        } else {
                            i33++;
                            f20 = f13;
                        }
                    }
                    MessageObject.GroupedMessages.TransitionParams transitionParams4 = groupedMessages2.transitionParams;
                    float f21 = f13;
                    un unVar2 = unVar;
                    transitionParams4.cell.B1(canvas, (int) f15, (int) f19, (int) f17, (int) f21, transitionParams4.pinnedTop, transitionParams4.pinnedBotton, z10, 0);
                    if (groupedMessages2 != currentMessagesGroup3) {
                        groupedMessages2.transitionParams.cell = null;
                    }
                    groupedMessages2.transitionParams.drawCaptionLayout = groupedMessages2.hasCaption;
                    if (z13) {
                        canvas.restore();
                        for (int i34 = 0; i34 < childCount; i34++) {
                            View childAt4 = unVar2.x0.getChildAt(i34);
                            if (childAt4 instanceof org.telegram.ui.Cells.s1) {
                                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) childAt4;
                                if (s1Var4.getCurrentMessagesGroup() == groupedMessages2) {
                                    int left = s1Var4.getLeft();
                                    int top = s1Var4.getTop();
                                    childAt4.setPivotX(((f17 - f15) / 2.0f) + (f15 - left));
                                    childAt4.setPivotY(((f21 - f19) / 2.0f) + (f19 - top));
                                }
                            }
                        }
                    }
                    i32++;
                    canvas2 = canvas;
                    unVar = unVar2;
                    i23 = i14;
                    f10 = 2.0f;
                }
                f12 = 0.0f;
                i13 = 2;
            } else {
                i12 = i10;
                i13 = i11;
                f12 = f7;
            }
            canvas2 = canvas;
            unVar = unVar;
            i10 = i12;
            f7 = f12;
            i11 = i13;
            f10 = f10;
            i23++;
            ojVar = this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D1(Canvas canvas, RectF rectF) {
        float f7;
        ArrayList arrayList;
        ArrayList arrayList2 = this.i3;
        int size = arrayList2.size();
        un unVar = this.H3;
        boolean z10 = 1;
        boolean z11 = false;
        if (size > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) arrayList2.get(i10);
                if (!un.g2(unVar, s1Var, rectF)) {
                    canvas.save();
                    canvas.translate(s1Var.E2(false) + s1Var.getLeft(), s1Var.getY() + s1Var.getPaddingTop());
                    s1Var.m2(s1Var.a() ? s1Var.getAlpha() : 1.0f, canvas, true);
                    canvas.restore();
                }
            }
            arrayList2.clear();
        }
        ArrayList arrayList3 = this.j3;
        int size2 = arrayList3.size();
        if (size2 > 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) arrayList3.get(i11);
                if (!un.g2(unVar, s1Var2, rectF)) {
                    float E2 = s1Var2.E2(false) + s1Var2.getLeft();
                    float y3 = s1Var2.getY() + s1Var2.getPaddingTop();
                    float alpha = s1Var2.a() ? s1Var2.getAlpha() : 1.0f;
                    canvas.save();
                    canvas.translate(E2, y3);
                    s1Var2.setInvalidatesParent(true);
                    s1Var2.W1(canvas, alpha);
                    s1Var2.setInvalidatesParent(false);
                    canvas.restore();
                }
            }
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.k3;
        int size3 = arrayList4.size();
        if (size3 > 0) {
            int i12 = 0;
            while (i12 < size3) {
                org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) arrayList4.get(i12);
                if (un.g2(unVar, s1Var3, rectF)) {
                    arrayList = arrayList4;
                } else {
                    boolean z12 = (s1Var3.getCurrentPosition() == null || (s1Var3.getCurrentPosition().flags & z10) != 0) ? z11 : z10;
                    float alpha2 = s1Var3.a() ? s1Var3.getAlpha() : 1.0f;
                    float E22 = s1Var3.E2(z11) + s1Var3.getLeft();
                    float y10 = s1Var3.getY() + s1Var3.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var3.getCurrentMessagesGroup();
                    if (currentMessagesGroup == null) {
                        arrayList = arrayList4;
                    } else if (currentMessagesGroup.transitionParams.backgroundChangeBounds) {
                        float E23 = s1Var3.E2(z10);
                        MessageObject.GroupedMessages.TransitionParams transitionParams = currentMessagesGroup.transitionParams;
                        float f10 = transitionParams.left + E23 + transitionParams.offsetLeft;
                        arrayList = arrayList4;
                        float f11 = transitionParams.top + transitionParams.offsetTop;
                        float f12 = transitionParams.right + E23 + transitionParams.offsetRight;
                        float f13 = transitionParams.bottom + transitionParams.offsetBottom;
                        if (!transitionParams.backgroundChangeBounds) {
                            f11 += s1Var3.getTranslationY();
                            f13 += s1Var3.getTranslationY();
                        }
                        canvas.clipRect(f10 + AndroidUtilities.dp(8.0f), f11 + AndroidUtilities.dp(8.0f), f12 - AndroidUtilities.dp(8.0f), f13 - AndroidUtilities.dp(8.0f));
                    } else {
                        arrayList = arrayList4;
                    }
                    if (s1Var3.getTransitionParams().v0) {
                        canvas.translate(E22, y10);
                        s1Var3.setInvalidatesParent(true);
                        s1Var3.I1(alpha2, canvas, z12);
                        s1Var3.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
                i12++;
                arrayList4 = arrayList;
                z10 = 1;
                z11 = false;
            }
            f7 = 8.0f;
            arrayList4.clear();
        } else {
            f7 = 8.0f;
        }
        ArrayList arrayList5 = this.l3;
        int size4 = arrayList5.size();
        if (size4 > 0) {
            for (int i13 = 0; i13 < size4; i13++) {
                org.telegram.ui.Cells.s1 s1Var4 = (org.telegram.ui.Cells.s1) arrayList5.get(i13);
                if (!un.g2(unVar, s1Var4, rectF)) {
                    boolean z13 = s1Var4.getCurrentPosition() != null && (s1Var4.getCurrentPosition().flags & 1) == 0;
                    float alpha3 = s1Var4.a() ? s1Var4.getAlpha() : 1.0f;
                    float E24 = s1Var4.E2(false) + s1Var4.getLeft();
                    float y11 = s1Var4.getY() + s1Var4.getPaddingTop();
                    canvas.save();
                    MessageObject.GroupedMessages currentMessagesGroup2 = s1Var4.getCurrentMessagesGroup();
                    if (currentMessagesGroup2 != null && currentMessagesGroup2.transitionParams.backgroundChangeBounds) {
                        float E25 = s1Var4.E2(true);
                        MessageObject.GroupedMessages.TransitionParams transitionParams2 = currentMessagesGroup2.transitionParams;
                        float f14 = transitionParams2.left + E25 + transitionParams2.offsetLeft;
                        float f15 = transitionParams2.top + transitionParams2.offsetTop;
                        float f16 = transitionParams2.right + E25 + transitionParams2.offsetRight;
                        float f17 = transitionParams2.bottom + transitionParams2.offsetBottom;
                        if (!transitionParams2.backgroundChangeBounds) {
                            f15 += s1Var4.getTranslationY();
                            f17 += s1Var4.getTranslationY();
                        }
                        canvas.clipRect(f14 + AndroidUtilities.dp(f7), f15 + AndroidUtilities.dp(f7), f16 - AndroidUtilities.dp(f7), f17 - AndroidUtilities.dp(f7));
                    }
                    if (!z13 && s1Var4.getTransitionParams().v0) {
                        canvas.translate(E24, y11);
                        s1Var4.setInvalidatesParent(true);
                        s1Var4.d2(canvas, alpha3, null);
                        s1Var4.N1(canvas, alpha3);
                        s1Var4.setInvalidatesParent(false);
                    }
                    canvas.restore();
                }
            }
            arrayList5.clear();
        }
    }

    public final void E1(MotionEvent motionEvent) {
        TLRPC.Chat chat;
        MessageObject.GroupedMessages H8;
        MessageObject messageObject;
        boolean z10;
        ArrayList arrayList;
        TLRPC.Chat chat2;
        un unVar = this.H3;
        if (motionEvent != null) {
            unVar.P4 = true;
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !unVar.r9 && !unVar.q9 && unVar.p9 == null) {
            z10 = ((org.telegram.ui.ActionBar.r2) unVar).inPreviewMode;
            if (!z10) {
                View pressedChildView = getPressedChildView();
                if (!(pressedChildView instanceof org.telegram.ui.Cells.s1)) {
                    if (!(pressedChildView instanceof org.telegram.ui.Cells.v0)) {
                        return;
                    }
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) pressedChildView;
                    float x9 = motionEvent.getX() - pressedChildView.getX();
                    float y3 = motionEvent.getY() - pressedChildView.getY();
                    if (!v0Var.L()) {
                        return;
                    }
                    org.telegram.ui.Wallet.m3 m3Var = v0Var.I0;
                    float f7 = (x9 - v0Var.K0) - (v0Var.j0 / 2.0f);
                    float paddingTop = (y3 - v0Var.L0) - v0Var.getPaddingTop();
                    org.telegram.ui.Wallet.l3 l3Var = m3Var.m;
                    if (l3Var != null && l3Var.n && m3Var.w.contains((int) f7, (int) paddingTop)) {
                        return;
                    }
                }
                if (unVar.p9 != null) {
                    un.Y1(unVar, 0.0f);
                }
                unVar.p9 = pressedChildView;
                MessageObject W1 = un.W1(unVar);
                boolean K6 = unVar.K6(W1);
                int i10 = unVar.d4;
                if ((i10 != 0 && i10 != 5 && i10 != 8 && (i10 != 3 || unVar.p4 != unVar.getUserConfig().getClientUserId())) || (((arrayList = unVar.m4) != null && arrayList.contains(W1)) || ((unVar.N8(W1) == 1 && (W1.getDialogId() == unVar.X6 || W1.needDrawBluredPreview())) || ((unVar.h == null && W1.getId() < 0) || (((chat2 = unVar.e) != null && ChatObject.isForum(chat2) && !K6) || unVar.l9() || (W1.isEphemeral() && W1.isOut())))))) {
                    un.Y1(unVar, 0.0f);
                    unVar.p9 = null;
                    return;
                } else {
                    this.p3 = motionEvent.getPointerId(0);
                    unVar.q9 = true;
                    this.n3 = (int) motionEvent.getX();
                    this.o3 = (int) motionEvent.getY();
                    return;
                }
            }
        }
        if (unVar.p9 != null && motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.p3) {
            int max = Math.max(AndroidUtilities.dp(-80.0f), Math.min(0, (int) (motionEvent.getX() - this.n3)));
            int abs = Math.abs(((int) motionEvent.getY()) - this.o3);
            if (getScrollState() == 0 && unVar.q9 && !unVar.r9 && max <= (-AndroidUtilities.getPixelsInCM(0.4f, true)) && Math.abs(max) / 3 > abs) {
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                unVar.p9.onTouchEvent(obtain);
                super.onInterceptTouchEvent(obtain);
                obtain.recycle();
                unVar.z0.R = false;
                unVar.q9 = false;
                unVar.r9 = true;
                this.n3 = (int) motionEvent.getX();
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            }
            if (unVar.r9) {
                if (Math.abs(max) < AndroidUtilities.dp(50.0f)) {
                    this.t3 = false;
                } else if (!this.t3) {
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    this.t3 = true;
                }
                float f10 = max;
                un.Y1(unVar, f10);
                MessageObject W12 = un.W1(unVar);
                if (W12 != null && (W12.isRoundVideo() || W12.isVideo())) {
                    unVar.Zc(false, false);
                }
                View view = unVar.p9;
                if (view instanceof org.telegram.ui.Cells.s1) {
                    F1((org.telegram.ui.Cells.s1) view, f10);
                }
                invalidate();
                return;
            }
            return;
        }
        if (unVar.p9 != null) {
            if (motionEvent != null) {
                if (motionEvent.getPointerId(0) != this.p3) {
                    return;
                }
                if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1 && motionEvent.getAction() != 6) {
                    return;
                }
            }
            if (motionEvent != null && motionEvent.getAction() != 3) {
                View view2 = unVar.p9;
                if (Math.abs(view2 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view2).E2(false) : view2 instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view2).getWalletSlidingOffset() : 0.0f) >= AndroidUtilities.dp(50.0f)) {
                    MessageObject W13 = un.W1(unVar);
                    boolean K62 = unVar.K6(W13);
                    lk lkVar = unVar.a1;
                    if ((lkVar == null || lkVar.getVisibility() != 0 || ((unVar.U0 && K62) || W13.wasJustSent)) && ((chat = unVar.e) == null || ((!ChatObject.isNotInChat(chat) || unVar.O9()) && ((!ChatObject.isChannel(unVar.e) || ChatObject.canPost(unVar.e) || unVar.e.megagroup) && ChatObject.canSendMessages(unVar.e))))) {
                        unVar.Nb(un.W1(unVar));
                    } else {
                        if (W13.getGroupId() != 0 && (H8 = unVar.H8(W13.getGroupId())) != null && (messageObject = H8.captionMessage) != null) {
                            W13 = messageObject;
                        }
                        unVar.z5 = W13;
                        Bundle c10 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
                        c10.putBoolean("quote", true);
                        c10.putBoolean("reply_to", true);
                        long peerDialogId = DialogObject.getPeerDialogId(W13.getFromPeer());
                        if (peerDialogId != 0 && peerDialogId != unVar.a() && peerDialogId != unVar.getUserConfig().getClientUserId() && peerDialogId > 0) {
                            c10.putLong("reply_to_author", peerDialogId);
                        }
                        c10.putInt("messagesCount", 1);
                        c10.putBoolean("canSelectTopics", true);
                        cy cyVar = new cy(c10);
                        cyVar.C2 = unVar;
                        unVar.presentFragment(cyVar);
                    }
                }
            }
            View view3 = unVar.p9;
            float slidingOffsetX = view3 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view3).getSlidingOffsetX() : view3 instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view3).getWalletSlidingOffset() : 0.0f;
            this.s3 = slidingOffsetX;
            if (slidingOffsetX == 0.0f) {
                unVar.p9 = null;
            }
            this.q3 = System.currentTimeMillis();
            this.r3 = 0.0f;
            invalidate();
            unVar.q9 = false;
            unVar.r9 = false;
            unVar.z0.R = true;
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean F0(View view) {
        return (view.getVisibility() == 4 || view.getVisibility() == 8) ? false : true;
    }

    public final void F1(org.telegram.ui.Cells.s1 s1Var, float f7) {
        MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != s1Var && (childAt instanceof org.telegram.ui.Cells.s1)) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                    s1Var2.setSlidingOffset(f7);
                    s1Var2.invalidate();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        if (this.H3.h != null) {
            return null;
        }
        return super.createAccessibilityNodeInfo();
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        un unVar = this.H3;
        unVar.G8 = null;
        canvas.save();
        if (unVar.ha != null && unVar.da) {
            boolean z10 = unVar.ea;
        }
        this.E1.setEmpty();
        if (unVar.Z9 != 0.0f) {
            int save = canvas.save();
            float measuredHeight = (-unVar.Z9) - (unVar.ga != 0.0f ? (unVar.x0.getMeasuredHeight() - unVar.Z9) * unVar.ga : 0.0f);
            unVar.La = measuredHeight;
            canvas.translate(0.0f, measuredHeight);
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
            canvas.restoreToCount(save);
        } else {
            C1(canvas, null);
            super.dispatchDraw(canvas);
            D1(canvas, null);
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r2.Z6) <= 200) goto L8;
     */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z10;
        float f7;
        int i10;
        int dp;
        org.telegram.ui.ActionBar.l5 l5Var;
        int i11;
        float f10;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.l5 l5Var2;
        boolean z11;
        boolean z12;
        in inVar;
        int i14;
        int i15;
        float f11;
        int dp2;
        int i16;
        float f12;
        float f13;
        boolean z13;
        un unVar = this.H3;
        ArrayList arrayList = unVar.G6;
        ColorMatrix colorMatrix = unVar.d7;
        m.d3 d3Var = unVar.e7;
        org.telegram.ui.ActionBar.l5 l5Var3 = unVar.f7;
        Paint paint = unVar.n7;
        Paint paint2 = unVar.b7;
        ArrayList arrayList2 = unVar.a7;
        Paint paint3 = unVar.c7;
        long j10 = unVar.Z6 != 0 ? 0L : 0L;
        if (!AndroidUtilities.isTablet() && !unVar.s4 && unVar.f == null) {
            TLRPC.Chat chat = unVar.e;
            boolean z14 = (chat == null || ChatObject.isChannelAndNotMegaGroup(chat)) && unVar.d4 != 7;
            if (unVar.Z9 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, -unVar.Z9);
            }
            int i17 = org.telegram.ui.ActionBar.y6.d6;
            org.telegram.ui.ActionBar.u6 u6Var = this.n2;
            boolean z15 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i17, u6Var)) <= 0.699999988079071d;
            int i18 = org.telegram.ui.ActionBar.y6.i6;
            boolean z16 = z14;
            int f14 = i0.a.f(z15 ? 0.9f : 0.5f, org.telegram.ui.ActionBar.y6.w0(i18, u6Var), Color.argb(z15 ? 33 : 3, 255, 255, 255));
            int o10 = i0.a.o(org.telegram.ui.ActionBar.y6.w0(i18, u6Var), z15 ? 24 : un.bd);
            if (unVar.m7 != o10 || unVar.l7 != f14) {
                unVar.l7 = f14;
                unVar.m7 = o10;
                int dp3 = AndroidUtilities.dp(200.0f);
                unVar.h7 = dp3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, dp3, 0.0f, new int[]{o10, f14, f14, o10}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                unVar.k7 = linearGradient;
                unVar.i7 = (-unVar.h7) * 2;
                paint2.setShader(linearGradient);
                int argb = Color.argb(z15 ? 43 : 96, 255, 255, 255);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, unVar.h7, 0.0f, new int[]{0, argb, argb, 0}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, tileMode);
                unVar.p7 = linearGradient2;
                paint.setShader(linearGradient2);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            org.telegram.ui.ActionBar.l5 l5Var4 = l5Var3;
            long j11 = unVar.g7;
            int i19 = 2;
            Matrix matrix = unVar.o7;
            m.d3 d3Var2 = d3Var;
            Matrix matrix2 = unVar.j7;
            long abs = Math.abs(j11 - elapsedRealtime);
            if (abs > 17) {
                abs = 16;
            }
            long j12 = abs < 4 ? j10 : abs;
            int width = getWidth();
            unVar.g7 = elapsedRealtime;
            int i20 = (int) (unVar.i7 + ((width * j12) / 400.0f));
            unVar.i7 = i20;
            if (i20 >= width * 2) {
                unVar.i7 = (-unVar.h7) * 2;
            }
            matrix2.setTranslate(unVar.i7, 0.0f);
            LinearGradient linearGradient3 = unVar.k7;
            if (linearGradient3 != null) {
                linearGradient3.setLocalMatrix(matrix2);
            }
            matrix.setTranslate(unVar.i7, 0.0f);
            LinearGradient linearGradient4 = unVar.p7;
            if (linearGradient4 != null) {
                linearGradient4.setLocalMatrix(matrix);
            }
            int height = ((getHeight() - unVar.Na) - ((int) (unVar.g9(org.telegram.ui.Components.a41.c) + unVar.v.d()))) - AndroidUtilities.dp(57.0f);
            int i21 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                int top = getChildAt(i22).getTop();
                if (top < i21) {
                    i21 = top;
                }
            }
            if (unVar.Z6 == j10 && i21 <= 0) {
                z13 = ((org.telegram.ui.ActionBar.r2) unVar).fragmentBeginToShow;
                unVar.S6(z13);
            }
            Paint X0 = X0("paintChatActionBackground");
            if (paint3.getColor() != X0.getColor()) {
                paint3.setColor(X0.getColor());
            }
            if (paint3.getShader() != X0.getShader()) {
                paint3.setShader(X0.getShader());
                colorMatrix.setSaturation(un.cd);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
            int i23 = 0;
            while (i23 < getChildCount()) {
                View childAt = getChildAt(i23);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                    MessageObject.GroupedMessages currentMessagesGroup = s1Var.getCurrentMessagesGroup();
                    float top2 = childAt.getTop() + s1Var.y2(true).getBounds().top;
                    if (currentMessagesGroup != null) {
                        f12 = 1.0f;
                        f13 = r13.top + currentMessagesGroup.transitionParams.offsetTop;
                    } else {
                        f12 = 1.0f;
                        f13 = 0.0f;
                    }
                    int i24 = (int) (top2 + f13);
                    i16 = i23;
                    if (unVar.Z6 == j10 && unVar.M9()) {
                        i24 = AndroidUtilities.lerp(height, i24, childAt.getAlpha());
                    } else if (childAt.getAlpha() != f12) {
                        i24 = height;
                    }
                    if (i24 < height) {
                        height = i24;
                    }
                } else {
                    i16 = i23;
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        int lerp = (unVar.Z6 == j10 && unVar.M9()) ? AndroidUtilities.lerp(height, childAt.getTop(), childAt.getAlpha()) : childAt.getAlpha() == 1.0f ? childAt.getTop() : height;
                        if (lerp < height) {
                            height = lerp;
                        }
                    }
                }
                i23 = i16 + 1;
            }
            if (unVar.M9()) {
                boolean z17 = SharedConfig.getDevicePerformanceClass() != 0 && org.telegram.ui.ActionBar.y6.c1();
                int i25 = org.telegram.ui.ActionBar.y6.d6;
                boolean z18 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i25, u6Var)) <= 0.699999988079071d && org.telegram.ui.ActionBar.y6.c1();
                boolean z19 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i25, u6Var)) <= 0.009999999776482582d && org.telegram.ui.ActionBar.y6.c1();
                if (z17) {
                    org.telegram.ui.ActionBar.y6.q(0.0f, getY() - unVar.I9, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                }
                int alpha = org.telegram.ui.ActionBar.y6.h2.getAlpha();
                if (z19) {
                    org.telegram.ui.ActionBar.y6.h2.setAlpha((int) (alpha * 4.0f));
                }
                if (unVar.Z6 != j10) {
                    z10 = z18;
                    f7 = 1.0f - ((System.currentTimeMillis() - unVar.Z6) / 200.0f);
                } else {
                    z10 = z18;
                    f7 = 1.0f;
                }
                int alpha2 = paint2.getAlpha();
                int alpha3 = paint3.getAlpha();
                int alpha4 = paint.getAlpha();
                sn snVar = unVar.qa;
                float f15 = (snVar == null || !snVar.q || paint3.getShader() == null) ? 1.0f : 0.3f;
                paint3.setAlpha((int) (255.0f * f7 * f15));
                float f16 = alpha2;
                paint2.setAlpha((int) (f7 * f15 * f16));
                paint.setAlpha((int) (f7 * f16));
                int i26 = 0;
                while (height > unVar.Ma) {
                    int dp4 = height - AndroidUtilities.dp(3.0f);
                    if (i26 >= arrayList2.size()) {
                        inVar = new in();
                        l5Var2 = l5Var4;
                        TLRPC.Chat chat2 = unVar.e;
                        if (chat2 == null || !ChatObject.isChannelAndNotMegaGroup(chat2)) {
                            z11 = z17;
                            inVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(64.0f);
                        } else {
                            z11 = z17;
                            inVar.b = Utilities.fastRandom.nextInt(AndroidUtilities.dp(64.0f)) + AndroidUtilities.dp(128.0f);
                        }
                        float width2 = unVar.x0.getWidth() * 0.8f;
                        if (z16) {
                            f11 = 42.0f;
                            dp2 = 0;
                        } else {
                            f11 = 42.0f;
                            dp2 = AndroidUtilities.dp(42.0f);
                        }
                        float f17 = width2 - dp2;
                        float dp5 = AndroidUtilities.dp(f11);
                        z12 = z10;
                        i13 = alpha;
                        inVar.a = (int) Math.min(f17, (d3.f(Utilities.fastRandom, 0.35f, 0.4f) * unVar.x0.getWidth()) + dp5);
                        arrayList2.add(inVar);
                    } else {
                        i13 = alpha;
                        l5Var2 = l5Var4;
                        z11 = z17;
                        z12 = z10;
                        inVar = (in) arrayList2.get(i26);
                    }
                    if (unVar.Z6 != j10) {
                        i14 = i19;
                        i15 = arrayList.size() <= i14 ? Math.min(inVar.c, dp4) : inVar.c;
                    } else {
                        i14 = i19;
                        i15 = dp4;
                    }
                    inVar.c = i15;
                    height = dp4 - inVar.b;
                    i26++;
                    i19 = i14;
                    z10 = z12;
                    z17 = z11;
                    l5Var4 = l5Var2;
                    alpha = i13;
                }
                int i27 = alpha;
                org.telegram.ui.ActionBar.l5 l5Var5 = l5Var4;
                boolean z20 = z17;
                boolean z21 = z10;
                if (arrayList2.isEmpty()) {
                    dp = getHeight() - unVar.Na;
                    i10 = 0;
                } else {
                    i10 = 0;
                    dp = ((in) arrayList2.get(0)).c + AndroidUtilities.dp(3.0f);
                }
                int dp6 = AndroidUtilities.dp(z16 ? 3.0f : 51.0f);
                if (unVar.L9()) {
                    dp6 = AndroidUtilities.lerp(dp6, AndroidUtilities.dp(71.0f), unVar.a9());
                }
                while (i10 < arrayList2.size() && dp > unVar.Ma) {
                    int dp7 = dp - AndroidUtilities.dp(3.0f);
                    in inVar2 = (in) arrayList2.get(i10);
                    int i28 = inVar2.c;
                    org.telegram.ui.ActionBar.l5 l5Var6 = l5Var5;
                    l5Var6.setBounds(dp6, i28 - inVar2.b, inVar2.a, i28);
                    m.d3 d3Var3 = d3Var2;
                    if (z20) {
                        l5Var6.d(canvas, d3Var3, paint3);
                    }
                    l5Var6.d(canvas, d3Var3, paint2);
                    if (z21) {
                        l5Var6.d(canvas, d3Var3, org.telegram.ui.ActionBar.y6.h2);
                    }
                    l5Var6.d(canvas, d3Var3, paint);
                    if (z16) {
                        l5Var = l5Var6;
                        i11 = dp6;
                    } else {
                        if (z20) {
                            f10 = 27.0f;
                            l5Var = l5Var6;
                            i11 = dp6;
                            canvas.drawCircle(AndroidUtilities.dp(27.0f), i28 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint3);
                        } else {
                            l5Var = l5Var6;
                            i11 = dp6;
                            f10 = 27.0f;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i28 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint2);
                        if (z21) {
                            i12 = i28;
                            canvas.drawCircle(AndroidUtilities.dp(f10), i28 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.y6.h2);
                        } else {
                            i12 = i28;
                        }
                        canvas.drawCircle(AndroidUtilities.dp(f10), i12 - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(21.0f), paint);
                    }
                    dp = dp7 - inVar2.b;
                    i10++;
                    d3Var2 = d3Var3;
                    dp6 = i11;
                    l5Var5 = l5Var;
                }
                paint3.setAlpha(alpha3);
                paint2.setAlpha(alpha2);
                paint.setAlpha(alpha4);
                org.telegram.ui.ActionBar.y6.h2.setAlpha(i27);
                invalidate();
            } else if (System.currentTimeMillis() - unVar.Z6 > 200) {
                arrayList2.clear();
            }
            arrayList2.size();
            arrayList.size();
            if (unVar.Z9 != 0.0f) {
                canvas.restore();
            }
        }
        super.draw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x028c, code lost:
    
        if ((r4 & 1) != 0) goto L160;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Type inference failed for: r0v52, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v61, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [org.telegram.ui.Cells.s4] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v15, types: [org.telegram.ui.Cells.s4] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v18, types: [org.telegram.ui.Cells.s4] */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        boolean z10;
        org.telegram.ui.Cells.s1 s1Var2;
        int i10;
        org.telegram.ui.Cells.v0 v0Var;
        MessageObject.GroupedMessages groupedMessages;
        int i11;
        boolean z11;
        float f7;
        boolean z12;
        float f10;
        boolean z13;
        float f11;
        boolean z14;
        boolean z15;
        int paddingTop;
        float f12;
        float checkBoxTranslation;
        int i12;
        float f13;
        int b10;
        int b11;
        int i13;
        int i14;
        int i15;
        MessageObject messageObject;
        un unVar = this.H3;
        if (unVar.M9()) {
            invalidate();
        }
        boolean z16 = view == unVar.V8;
        boolean z17 = view instanceof org.telegram.ui.Cells.s1;
        if (z17) {
            s1Var = (org.telegram.ui.Cells.s1) view;
            z10 = s1Var.Zc.w0;
        } else {
            s1Var = null;
            z10 = false;
        }
        if ((!org.telegram.ui.Components.vw0.k0 && ((view.getY() > getMeasuredHeight() || view.getY() + view.getMeasuredHeight() < 0.0f) && !z10)) || view.getVisibility() == 4 || view.getVisibility() == 8) {
            z16 = true;
        }
        if (z17) {
            s1Var2 = (org.telegram.ui.Cells.s1) view;
            if (unVar.z6.contains(s1Var2)) {
                z16 = true;
            }
            MessageObject.GroupedMessagePosition currentPosition = s1Var2.getCurrentPosition();
            groupedMessages = s1Var2.getCurrentMessagesGroup();
            if (currentPosition != null) {
                int i16 = currentPosition.pw;
                int i17 = currentPosition.spanSize;
                if (i16 != i17 && i17 == 1000 && currentPosition.siblingHeights == null && groupedMessages.hasSibling) {
                    i10 = s1Var2.getBackgroundDrawableLeft();
                    i14 = 0;
                    i15 = s1Var2.K1;
                    if (i15 != 7) {
                    }
                    unVar.G8 = s1Var2;
                    if (!z16) {
                    }
                    if (z16) {
                    }
                    i11 = i14;
                    v0Var = null;
                } else if (currentPosition.siblingHeights != null) {
                    i14 = view.getBottom() - AndroidUtilities.dp((s1Var2.m3() ? 1 : 0) + 1);
                    i10 = 0;
                    i15 = s1Var2.K1;
                    if ((i15 != 7 || i15 == 4) && (messageObject = s1Var2.y7) != null && messageObject.type != 5 && MediaController.getInstance().isPlayingMessage(s1Var2.y7)) {
                        unVar.G8 = s1Var2;
                    }
                    if (!z16) {
                        View view2 = unVar.V8;
                        if (view2 instanceof org.telegram.ui.Cells.s1) {
                            org.telegram.ui.Cells.s1 s1Var3 = (org.telegram.ui.Cells.s1) view2;
                            if (s1Var3.getCurrentMessagesGroup() != null && s1Var3.getCurrentMessagesGroup() == groupedMessages) {
                                z16 = true;
                            }
                        }
                    }
                    if (z16) {
                        s1Var2.getPhotoImage().skipDraw();
                    }
                    i11 = i14;
                    v0Var = null;
                }
            }
            i10 = 0;
            i14 = 0;
            i15 = s1Var2.K1;
            if (i15 != 7) {
            }
            unVar.G8 = s1Var2;
            if (!z16) {
            }
            if (z16) {
            }
            i11 = i14;
            v0Var = null;
        } else {
            if (view instanceof org.telegram.ui.Cells.v0) {
                v0Var = (org.telegram.ui.Cells.v0) view;
                s1Var2 = null;
                i10 = 0;
            } else {
                s1Var2 = null;
                i10 = 0;
                v0Var = null;
            }
            groupedMessages = null;
            i11 = 0;
        }
        if (i10 != 0) {
            canvas.save();
        } else if (i11 != 0) {
            canvas.save();
        }
        if (z16) {
            z16 = false;
        }
        if (z16) {
            z11 = true;
            f7 = 0.0f;
            z12 = false;
        } else {
            boolean z18 = (s1Var2 == null || s1Var2.Zc.v1 || groupedMessages == null || !groupedMessages.transitionParams.backgroundChangeBounds) ? false : true;
            if (z18) {
                canvas.save();
                float E2 = s1Var2.E2(true);
                MessageObject.GroupedMessages.TransitionParams transitionParams = groupedMessages.transitionParams;
                z11 = true;
                float f14 = transitionParams.right + E2;
                f7 = 0.0f;
                canvas.clipRect(transitionParams.left + E2 + transitionParams.offsetLeft + AndroidUtilities.dp(4.0f), transitionParams.top + transitionParams.offsetTop + AndroidUtilities.dp(4.0f), (f14 + transitionParams.offsetRight) - AndroidUtilities.dp(4.0f), (transitionParams.bottom + transitionParams.offsetBottom) - AndroidUtilities.dp(4.0f));
            } else {
                z11 = true;
                f7 = 0.0f;
            }
            if (s1Var2 != null) {
                org.telegram.ui.Cells.r1 r1Var = s1Var2.Zc;
                if (r1Var.v1) {
                    canvas.save();
                    canvas.translate(s1Var2.getX(), s1Var2.getY());
                    s1Var2.S1(canvas);
                    canvas.restore();
                    z12 = r1Var.g;
                    if (z18) {
                        canvas.restore();
                    }
                    if (s1Var2 == null && s1Var2.U2()) {
                        canvas.save();
                        canvas.translate(s1Var2.getX(), s1Var2.getPaddingTopAnimated() + s1Var2.getY());
                        s1Var2.X1(canvas);
                        canvas.restore();
                    } else if (v0Var != null) {
                        canvas.save();
                        canvas.translate(v0Var.getX(), v0Var.getY());
                        v0Var.A(canvas);
                        canvas.restore();
                    }
                }
            }
            z12 = (s1Var2 == null || !z18) ? super.drawChild(canvas, view, j10) : super.drawChild(canvas, view, j10);
            if (z18) {
            }
            if (s1Var2 == null) {
            }
            if (v0Var != null) {
            }
        }
        if (i10 != 0 || i11 != 0) {
            canvas.restore();
        }
        if (view.getTranslationY() != f7) {
            canvas.save();
            f10 = f7;
            canvas.translate(f10, view.getTranslationY());
        } else {
            f10 = f7;
        }
        if (s1Var2 != null) {
            s1Var2.K1(canvas);
        }
        if (view.getTranslationY() != f10) {
            canvas.restore();
        }
        if (view.getTranslationY() != f10) {
            canvas.save();
            canvas.translate(f10, view.getTranslationY());
        }
        if (s1Var2 != null) {
            MessageObject messageObject2 = s1Var2.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition2 = s1Var2.getCurrentPosition();
            if (!z16) {
                if (currentPosition2 != null || s1Var2.getTransitionParams().w0) {
                    if (currentPosition2 == null || currentPosition2.last || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) {
                        if (currentPosition2 == null || currentPosition2.last) {
                            this.i3.add(s1Var2);
                        }
                        if ((currentPosition2 == null || (currentPosition2.minX == 0 && currentPosition2.minY == 0)) && s1Var2.T2()) {
                            this.j3.add(s1Var2);
                        }
                    }
                    if (currentPosition2 != null || s1Var2.getTransitionParams().C0 || s1Var2.getTransitionParams().w0) {
                        if (currentPosition2 == null || (currentPosition2.flags & s1Var2.s0()) != 0) {
                            this.k3.add(s1Var2);
                        }
                        if (currentPosition2 != null) {
                            int i18 = currentPosition2.flags;
                            if ((i18 & 8) != 0) {
                            }
                        }
                        this.l3.add(s1Var2);
                    }
                }
                if (unVar.F8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                    ImageReceiver photoImage = s1Var2.getPhotoImage();
                    float x9 = s1Var2.getX() + photoImage.getImageX();
                    float y3 = (unVar.x0.getY() + (photoImage.getImageY() + (s1Var2.getY() + s1Var2.getPaddingTop()))) - unVar.F8.getTop();
                    if (unVar.F8.getTranslationX() != x9 || unVar.F8.getTranslationY() != y3) {
                        unVar.F8.setTranslationX(x9);
                        unVar.F8.setTranslationY(y3);
                        unVar.fragmentView.invalidate();
                        unVar.F8.invalidate();
                    }
                }
            }
        }
        if (s1Var != null) {
            MessageObject messageObject3 = s1Var.getMessageObject();
            MessageObject.GroupedMessagePosition currentPosition3 = s1Var.getCurrentPosition();
            ImageReceiver avatarImage = s1Var.getAvatarImage();
            if (avatarImage != null && unVar.a9() < 1.0f) {
                MessageObject.GroupedMessages h92 = unVar.h9(messageObject3);
                if (!s1Var.getMessageObject().deleted) {
                    unVar.x0.getClass();
                    if (RecyclerView.R(view) != -1) {
                        z14 = z11;
                        z15 = (!unVar.x0.V1 || (h92 != null && h92.transitionParams.backgroundChangeBounds)) ? z11 : false;
                        paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                        if (s1Var.i()) {
                            if (s1Var.oc) {
                                b11 = ((SparseArray) unVar.i9.j).indexOfValue(view);
                                if (b11 >= 0) {
                                    b11 = ((SparseArray) unVar.i9.j).keyAt(b11);
                                }
                            } else {
                                b11 = unVar.x0.T(view).b();
                            }
                            if (b11 >= 0) {
                                if (h92 == null || currentPosition3 == null) {
                                    z13 = z12;
                                    f12 = 1.0f;
                                    i13 = b11 - 1;
                                } else {
                                    int indexOf = h92.posArray.indexOf(currentPosition3);
                                    f12 = 1.0f;
                                    int size = h92.posArray.size();
                                    if ((currentPosition3.flags & 8) != 0) {
                                        i13 = (b11 - size) + indexOf;
                                    } else {
                                        i13 = b11 - 1;
                                        int i19 = indexOf + 1;
                                        while (i19 < size) {
                                            z13 = z12;
                                            if (h92.posArray.get(i19).minY > currentPosition3.maxY) {
                                                break;
                                            }
                                            i13--;
                                            i19++;
                                            z12 = z13;
                                        }
                                    }
                                    z13 = z12;
                                }
                                if (s1Var.oc) {
                                    if (((View) ((SparseArray) unVar.i9.j).get(i13)) != null) {
                                        if (view.getTranslationY() != 0.0f) {
                                            canvas.restore();
                                        }
                                        avatarImage.setVisible(false, false);
                                        return z13;
                                    }
                                } else if (unVar.x0.K(i13) != null) {
                                    if (view.getTranslationY() != 0.0f) {
                                        canvas.restore();
                                    }
                                    avatarImage.setVisible(false, false);
                                    return z13;
                                }
                                checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                                int layoutHeight = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                                int measuredHeight = unVar.x0.getMeasuredHeight() - unVar.x0.getPaddingBottom();
                                boolean z19 = ((!s1Var.m1 || s1Var.n1) && checkBoxTranslation == 0.0f) ? z11 : false;
                                if (!s1Var.o3() || s1Var.getTransitionParams().k2) {
                                    if (s1Var.getTransitionParams().k2) {
                                        float f15 = s1Var.getTransitionParams().K1;
                                        if (!s1Var.o3()) {
                                            f15 = f12 - f15;
                                        }
                                        layoutHeight = (int) c3.h0.z(f12, f15, Math.min(layoutHeight, measuredHeight), layoutHeight * f15);
                                    }
                                } else if (layoutHeight > measuredHeight) {
                                    layoutHeight = measuredHeight;
                                }
                                if (!z15 && view.getTranslationY() != 0.0f) {
                                    canvas.restore();
                                }
                                if (s1Var.g()) {
                                    if (s1Var.oc) {
                                        b10 = ((SparseArray) unVar.i9.j).indexOfValue(view);
                                        if (b10 >= 0) {
                                            b10 = ((SparseArray) unVar.i9.j).keyAt(b10);
                                        }
                                    } else {
                                        b10 = unVar.x0.T(view).b();
                                    }
                                    if (b10 >= 0) {
                                        float f16 = checkBoxTranslation;
                                        ?? r11 = s1Var;
                                        int i20 = b10;
                                        int i21 = 0;
                                        while (i21 < 20) {
                                            i21++;
                                            if (h92 == null || currentPosition3 == null) {
                                                i12 = layoutHeight;
                                                i20++;
                                            } else {
                                                int indexOf2 = h92.posArray.indexOf(currentPosition3);
                                                if (indexOf2 < 0) {
                                                    break;
                                                }
                                                i12 = layoutHeight;
                                                h92.posArray.size();
                                                if ((currentPosition3.flags & 4) != 0) {
                                                    i20 = i20 + indexOf2 + 1;
                                                } else {
                                                    i20++;
                                                    for (int i22 = indexOf2 - 1; i22 >= 0 && h92.posArray.get(i22).maxY >= currentPosition3.minY; i22--) {
                                                        i20++;
                                                    }
                                                }
                                            }
                                            if (!r11.h()) {
                                                s4.e1 K = unVar.x0.K(i20);
                                                if (K == null) {
                                                    break;
                                                }
                                                ?? r02 = K.a;
                                                paddingTop = r02.getPaddingTop() + r02.getTop();
                                                if (!(r02 instanceof org.telegram.ui.Cells.s1)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.s4) r02;
                                                float checkBoxTranslation2 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z19 && checkBoxTranslation2 > 0.0f) {
                                                    f16 = checkBoxTranslation2;
                                                }
                                                if (!r11.g()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            } else {
                                                ?? r03 = (View) ((SparseArray) unVar.i9.j).get(i20);
                                                if (r03 == 0) {
                                                    break;
                                                }
                                                paddingTop = r03.getPaddingTop() + r03.getTop();
                                                if (!(r03 instanceof org.telegram.ui.Cells.s4)) {
                                                    break;
                                                }
                                                r11 = (org.telegram.ui.Cells.s4) r03;
                                                float checkBoxTranslation3 = r11.getCheckBoxTranslation() + r11.getSlidingOffsetX();
                                                if (z19 && checkBoxTranslation3 > 0.0f) {
                                                    f16 = checkBoxTranslation3;
                                                }
                                                if (!r11.g()) {
                                                    break;
                                                }
                                                layoutHeight = i12;
                                                r11 = r11;
                                            }
                                            int dp = i12 - AndroidUtilities.dp(48.0f) < paddingTop ? AndroidUtilities.dp(48.0f) + paddingTop : i12;
                                            if (!s1Var.i()) {
                                                int bottom = z15 ? view.getBottom() : (int) (s1Var.getDeltaBottom() + s1Var.getY() + s1Var.getMeasuredHeight());
                                                if (dp > bottom) {
                                                    dp = bottom;
                                                }
                                            }
                                            canvas.save();
                                            if (checkBoxTranslation != 0.0f) {
                                                canvas.translate(checkBoxTranslation, 0.0f);
                                            }
                                            if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                                org.telegram.ui.Cells.s1 s1Var4 = s1Var;
                                                if (s1Var4.getCurrentMessagesGroup() != null && s1Var4.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                                                    dp = (int) (dp - s1Var4.getTranslationY());
                                                }
                                            }
                                            if (z14) {
                                                avatarImage.setImageY(dp - AndroidUtilities.dp(44.0f));
                                            }
                                            if (s1Var.a()) {
                                                avatarImage.setAlpha(s1Var.getAlpha() * (1.0f - unVar.a9()));
                                                canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX() + s1Var.getX(), s1Var.getY() + (s1Var.getHeight() >> 1));
                                                f13 = 1.0f;
                                            } else {
                                                f13 = 1.0f;
                                                avatarImage.setAlpha(1.0f - unVar.a9());
                                            }
                                            if (z14) {
                                                avatarImage.setVisible(z11, false);
                                            }
                                            if (unVar.a9() > 0.0f) {
                                                canvas.scale(f13 - unVar.a9(), f13 - unVar.a9(), avatarImage.getImageX2(), avatarImage.getImageY2());
                                                f11 = 0.0f;
                                                canvas.translate(unVar.a9() * AndroidUtilities.dp(24.0f), 0.0f);
                                            } else {
                                                f11 = 0.0f;
                                            }
                                            avatarImage.draw(canvas);
                                            canvas.restore();
                                            if (!z15 && view.getTranslationY() != f11) {
                                                canvas.save();
                                            }
                                            if (view.getTranslationY() != f11) {
                                                canvas.restore();
                                            }
                                            return z13;
                                        }
                                        i12 = layoutHeight;
                                        s1Var = r11;
                                        checkBoxTranslation = f16;
                                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                        }
                                        if (!s1Var.i()) {
                                        }
                                        canvas.save();
                                        if (checkBoxTranslation != 0.0f) {
                                        }
                                        if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                        }
                                        if (z14) {
                                        }
                                        if (s1Var.a()) {
                                        }
                                        if (z14) {
                                        }
                                        if (unVar.a9() > 0.0f) {
                                        }
                                        avatarImage.draw(canvas);
                                        canvas.restore();
                                        if (!z15) {
                                            canvas.save();
                                        }
                                        if (view.getTranslationY() != f11) {
                                        }
                                        return z13;
                                    }
                                }
                                i12 = layoutHeight;
                                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                                }
                                if (!s1Var.i()) {
                                }
                                canvas.save();
                                if (checkBoxTranslation != 0.0f) {
                                }
                                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                                }
                                if (z14) {
                                }
                                if (s1Var.a()) {
                                }
                                if (z14) {
                                }
                                if (unVar.a9() > 0.0f) {
                                }
                                avatarImage.draw(canvas);
                                canvas.restore();
                                if (!z15) {
                                }
                                if (view.getTranslationY() != f11) {
                                }
                                return z13;
                            }
                        }
                        z13 = z12;
                        f12 = 1.0f;
                        checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                        int layoutHeight2 = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                        int measuredHeight2 = unVar.x0.getMeasuredHeight() - unVar.x0.getPaddingBottom();
                        if (s1Var.m1) {
                        }
                        if (s1Var.o3()) {
                        }
                        if (s1Var.getTransitionParams().k2) {
                        }
                        if (!z15) {
                            canvas.restore();
                        }
                        if (s1Var.g()) {
                        }
                        i12 = layoutHeight2;
                        if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                        }
                        if (!s1Var.i()) {
                        }
                        canvas.save();
                        if (checkBoxTranslation != 0.0f) {
                        }
                        if (s1Var instanceof org.telegram.ui.Cells.s1) {
                        }
                        if (z14) {
                        }
                        if (s1Var.a()) {
                        }
                        if (z14) {
                        }
                        if (unVar.a9() > 0.0f) {
                        }
                        avatarImage.draw(canvas);
                        canvas.restore();
                        if (!z15) {
                        }
                        if (view.getTranslationY() != f11) {
                        }
                        return z13;
                    }
                }
                z14 = false;
                if (unVar.x0.V1) {
                }
                paddingTop = view.getPaddingTop() + (!z15 ? view.getTop() : (int) view.getY());
                if (s1Var.i()) {
                }
                z13 = z12;
                f12 = 1.0f;
                checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                int layoutHeight22 = (int) (s1Var2.getLayoutHeight() + s1Var2.getTransitionParams().i0 + ((int) (s1Var.getPaddingTopAnimated() + ((int) (0 + (z15 ? view.getTop() : view.getY()))))));
                int measuredHeight22 = unVar.x0.getMeasuredHeight() - unVar.x0.getPaddingBottom();
                if (s1Var.m1) {
                }
                if (s1Var.o3()) {
                }
                if (s1Var.getTransitionParams().k2) {
                }
                if (!z15) {
                }
                if (s1Var.g()) {
                }
                i12 = layoutHeight22;
                if (i12 - AndroidUtilities.dp(48.0f) < paddingTop) {
                }
                if (!s1Var.i()) {
                }
                canvas.save();
                if (checkBoxTranslation != 0.0f) {
                }
                if (s1Var instanceof org.telegram.ui.Cells.s1) {
                }
                if (z14) {
                }
                if (s1Var.a()) {
                }
                if (z14) {
                }
                if (unVar.a9() > 0.0f) {
                }
                avatarImage.draw(canvas);
                canvas.restore();
                if (!z15) {
                }
                if (view.getTranslationY() != f11) {
                }
                return z13;
            }
        }
        z13 = z12;
        f11 = 0.0f;
        if (view.getTranslationY() != f11) {
        }
        return z13;
    }

    @Override // org.telegram.ui.Components.mm0
    public final void k1(View view, float f7, float f10, boolean z10) {
        MessageObject.GroupedMessages currentMessagesGroup;
        super.k1(view, f7, f10, z10);
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            MessageObject messageObject = s1Var.getMessageObject();
            if (messageObject.isMusic() || messageObject.isDocument() || (currentMessagesGroup = s1Var.getCurrentMessagesGroup()) == null) {
                return;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt != view && (childAt instanceof org.telegram.ui.Cells.s1)) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var2.getCurrentMessagesGroup() == currentMessagesGroup) {
                        s1Var2.setPressed(z10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:191:0x06ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f7;
        float f10;
        rp rpVar;
        int i10;
        float f11;
        int i11;
        String string;
        String string2;
        String string3;
        int i12;
        TLRPC.TL_forumTopic tL_forumTopic;
        int i13;
        Paint paint;
        Paint paint2;
        int i14;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Paint paint3;
        float f17;
        Paint paint4;
        Paint paint5;
        float f18;
        float f19;
        float f20;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i15;
        float f21;
        float f22;
        super.onDraw(canvas);
        un unVar = this.H3;
        View view = unVar.p9;
        if (view != null) {
            float slidingOffsetX = view instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view).getSlidingOffsetX() : view instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view).getWalletSlidingOffset() : 0.0f;
            if (!unVar.q9 && !unVar.r9 && this.s3 != 0.0f && slidingOffsetX != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                float f23 = ((currentTimeMillis - this.q3) / 180.0f) + this.r3;
                this.r3 = f23;
                if (f23 > 1.0f) {
                    this.r3 = 1.0f;
                }
                this.q3 = currentTimeMillis;
                float interpolation = (1.0f - AndroidUtilities.decelerateInterpolator.getInterpolation(this.r3)) * this.s3;
                if (interpolation == 0.0f) {
                    this.s3 = 0.0f;
                }
                View view2 = unVar.p9;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                    F1((org.telegram.ui.Cells.s1) view2, interpolation);
                }
                un.Y1(unVar, interpolation);
                MessageObject W1 = un.W1(unVar);
                if (W1 != null && (W1.isRoundVideo() || W1.isVideo())) {
                    unVar.Zc(false, false);
                }
                float f24 = this.r3;
                if (f24 == 1.0f || f24 == 0.0f) {
                    un.Y1(unVar, 0.0f);
                    unVar.p9 = null;
                }
                invalidate();
            }
            if (unVar.p9 != null && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Paint X0 = X0("paintChatActionBackground");
                Paint paint6 = org.telegram.ui.ActionBar.y6.h2;
                Paint paint7 = this.v3;
                if (paint7.getColor() != X0.getColor()) {
                    paint7.setColor(X0.getColor());
                }
                Paint paint8 = this.w3;
                if (paint8.getColor() != paint6.getColor()) {
                    paint8.setColor(paint6.getColor());
                }
                if (paint7.getShader() != X0.getShader()) {
                    paint7.setShader(X0.getShader());
                }
                if (paint8.getShader() != paint6.getShader()) {
                    paint8.setShader(paint6.getShader());
                }
                ac.a aVar = this.z3;
                float f25 = aVar.a;
                float f26 = this.u3;
                float f27 = f25 / f26;
                f7 = 255.0f;
                int color = paint8.getColor();
                if (f27 > 1.0f) {
                    this.D3 = true;
                }
                f10 = 2.0f;
                View view3 = unVar.p9;
                float E2 = view3 instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) view3).E2(false) : view3 instanceof org.telegram.ui.Cells.v0 ? ((org.telegram.ui.Cells.v0) view3).getWalletSlidingOffset() : 0.0f;
                ac.a aVar2 = this.x3;
                float f28 = aVar2.a;
                ac.a aVar3 = this.B3;
                o1.j jVar = this.C3;
                o1.j jVar2 = this.A3;
                if (f28 == 0.0f) {
                    jVar2.c();
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                    double d = 0.0f;
                    jVar2.u.i = d;
                    aVar.a = 0.0f;
                    jVar.c();
                    jVar.u.i = d;
                    aVar3.a = 0.0f;
                    this.D3 = false;
                } else {
                    paint = paint6;
                    paint2 = paint7;
                    i14 = color;
                }
                if (((float) jVar2.u.i) != f26) {
                    f12 = 1.0f;
                    f13 = a8.ee.a(((-E2) - AndroidUtilities.dp(20.0f)) / AndroidUtilities.dp(30.0f), 0.0f, 1.0f);
                } else {
                    f12 = 1.0f;
                    f13 = 1.0f;
                }
                if (f13 == f12) {
                    o1.k kVar = jVar2.u;
                    f14 = 20.0f;
                    f15 = f27;
                    if (((float) kVar.i) != f26) {
                        double d10 = f26;
                        kVar.i = d10;
                        jVar2.h();
                        jVar.u.i = d10;
                        jVar.h();
                    }
                } else {
                    f14 = 20.0f;
                    f15 = f27;
                }
                float f29 = E2 <= ((float) (-AndroidUtilities.dp(f14))) ? f26 : 0.0f;
                o1.j jVar3 = this.y3;
                o1.k kVar2 = jVar3.u;
                if (f29 != ((float) kVar2.i)) {
                    kVar2.i = f29;
                    if (!jVar3.f) {
                        jVar3.h();
                    }
                }
                float f30 = aVar2.a / f26;
                MessageObject W12 = un.W1(unVar);
                float measuredWidth = (E2 * ((W12 == null || !W12.isOut()) ? 1.0f : 0.5f)) + getMeasuredWidth();
                float measuredHeight = (unVar.p9.getMeasuredHeight() / 2.0f) + unVar.p9.getTop();
                boolean z10 = this.D3;
                float f31 = z10 ? f15 : f30;
                float f32 = z10 ? 0.0f : 1.0f - f15;
                int i16 = org.telegram.ui.ActionBar.y6.d6;
                org.telegram.ui.ActionBar.u6 u6Var2 = this.n2;
                boolean z11 = i0.a.h(org.telegram.ui.ActionBar.y6.w0(i16, u6Var2)) <= 0.5d;
                if (f30 != 0.0f) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    f18 = f26;
                    rectF.set((int) ((paint2.getStrokeWidth() / 2.0f) + (measuredWidth - (AndroidUtilities.dp(16.0f) * f31))), (int) ((paint2.getStrokeWidth() / 2.0f) + (measuredHeight - (AndroidUtilities.dp(16.0f) * f31))), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredWidth) - (paint2.getStrokeWidth() / 2.0f)), (int) (((AndroidUtilities.dp(16.0f) * f31) + measuredHeight) - (paint2.getStrokeWidth() / 2.0f)));
                    org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                    if (f15 == 0.0f) {
                        int alpha = paint2.getAlpha();
                        Paint paint9 = paint2;
                        paint9.setAlpha((int) (alpha * f30));
                        float f33 = f13 * 360.0f;
                        f16 = f13;
                        f19 = f30;
                        paint3 = paint;
                        u6Var = u6Var2;
                        f17 = measuredWidth;
                        f20 = measuredHeight;
                        canvas.drawArc(rectF, -90.0f, f33, false, paint9);
                        paint9.setAlpha(alpha);
                        if (unVar.qa.f()) {
                            int alpha2 = paint8.getAlpha();
                            paint5 = paint8;
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha2 * f19));
                            paint4 = paint9;
                            canvas2 = canvas;
                            canvas2.drawArc(rectF, -90.0f, f33, false, paint5);
                        } else {
                            paint4 = paint9;
                            paint5 = paint8;
                            canvas2 = canvas;
                        }
                    } else {
                        Paint paint10 = paint2;
                        f16 = f13;
                        paint3 = paint;
                        f17 = measuredWidth;
                        paint4 = paint10;
                        canvas2 = canvas;
                        f19 = f30;
                        paint5 = paint8;
                        u6Var = u6Var2;
                        f20 = measuredHeight;
                    }
                } else {
                    Paint paint11 = paint2;
                    f16 = f13;
                    paint3 = paint;
                    f17 = measuredWidth;
                    paint4 = paint11;
                    canvas2 = canvas;
                    paint5 = paint8;
                    f18 = f26;
                    f19 = f30;
                    f20 = measuredHeight;
                    u6Var = u6Var2;
                }
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f31)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f31)), (int) ((AndroidUtilities.dp(16.0f) * f31) + f17), (int) ((AndroidUtilities.dp(16.0f) * f31) + f20));
                org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                Path path = this.E3;
                path.rewind();
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f31, AndroidUtilities.dp(16.0f) * f31, direction);
                int alpha3 = X0.getAlpha();
                float f34 = 0.6f * f19 * f16;
                X0.setAlpha((int) (alpha3 * f34));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha3);
                if (unVar.qa.f()) {
                    int alpha4 = org.telegram.ui.ActionBar.y6.h2.getAlpha();
                    if (z11) {
                        f22 = f34;
                        org.telegram.ui.ActionBar.y6.h2.setColor(-1);
                    } else {
                        f22 = f34;
                    }
                    org.telegram.ui.ActionBar.y6.h2.setAlpha((int) (alpha4 * f22));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.y6.h2);
                    org.telegram.ui.ActionBar.y6.h2.setAlpha(alpha4);
                }
                int i17 = (f32 > 0.0f ? 1 : (f32 == 0.0f ? 0 : -1));
                if (i17 != 0) {
                    i15 = i17;
                    f21 = f31;
                    rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f32)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f32)), (int) ((AndroidUtilities.dp(16.0f) * f32) + f17), (int) ((AndroidUtilities.dp(16.0f) * f32) + f20));
                    path.rewind();
                    path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), direction);
                    canvas2.save();
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                } else {
                    i15 = i17;
                    f21 = f31;
                }
                rectF2.set((int) (f17 - (AndroidUtilities.dp(16.0f) * f21)), (int) (f20 - (AndroidUtilities.dp(16.0f) * f21)), (int) ((AndroidUtilities.dp(16.0f) * f21) + f17), (int) ((AndroidUtilities.dp(16.0f) * f21) + f20));
                org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                path.rewind();
                path.addRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f21, AndroidUtilities.dp(16.0f) * f21, direction);
                int alpha5 = X0.getAlpha();
                float f35 = 0.4f * f19;
                X0.setAlpha((int) (alpha5 * f35));
                canvas2.drawPath(path, X0);
                X0.setAlpha(alpha5);
                if (unVar.qa.f()) {
                    int alpha6 = org.telegram.ui.ActionBar.y6.h2.getAlpha();
                    if (z11) {
                        org.telegram.ui.ActionBar.y6.h2.setColor(-1);
                    }
                    org.telegram.ui.ActionBar.y6.h2.setAlpha((int) (f35 * alpha6));
                    canvas2.drawPath(path, org.telegram.ui.ActionBar.y6.h2);
                    org.telegram.ui.ActionBar.y6.h2.setAlpha(alpha6);
                }
                if (i15 != 0) {
                    canvas2.restore();
                }
                float f36 = aVar3.a / f18;
                if (f36 != 0.0f && f36 != 1.0f) {
                    float f37 = f36 + 1.0f;
                    float strokeWidth = paint4.getStrokeWidth();
                    float f38 = (1.0f - f36) * strokeWidth;
                    if (f38 != 0.0f) {
                        rectF2.set((int) ((f17 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) ((f20 - (AndroidUtilities.dp(16.0f) * f37)) + f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f17) - f38), (int) (((AndroidUtilities.dp(16.0f) * f37) + f20) - f38));
                        org.telegram.ui.ActionBar.y6.q(0.0f, getY() + rectF2.top, getMeasuredWidth(), AndroidUtilities.displaySize.y);
                        int alpha7 = paint4.getAlpha();
                        paint4.setAlpha((int) (alpha7 * f19));
                        paint4.setStrokeWidth(f38);
                        canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint4);
                        paint4.setStrokeWidth(strokeWidth);
                        paint4.setAlpha(alpha7);
                        if (unVar.qa.f()) {
                            int alpha8 = paint5.getAlpha();
                            if (z11) {
                                paint5.setColor(-1);
                            }
                            paint5.setAlpha((int) (alpha8 * f19));
                            paint5.setStrokeWidth(f38);
                            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(16.0f) * f37, AndroidUtilities.dp(16.0f) * f37, paint5);
                            paint5.setStrokeWidth(strokeWidth);
                        }
                    }
                }
                int i18 = (int) (f19 * 255.0f);
                Drawable drawable = u6Var != null ? u6Var.getDrawable("drawableReplyIcon") : null;
                if (drawable == null) {
                    drawable = org.telegram.ui.ActionBar.y6.Q0("drawableReplyIcon");
                }
                drawable.setAlpha(i18);
                drawable.setBounds((int) (f17 - ((drawable.getIntrinsicWidth() / 2) * f21)), (int) (f20 - ((drawable.getIntrinsicHeight() / 2) * f21)), (int) (((drawable.getIntrinsicWidth() / 2) * f21) + f17), (int) (((drawable.getIntrinsicHeight() / 2) * f21) + f20));
                drawable.draw(canvas2);
                drawable.setAlpha(255);
                int i19 = i14;
                paint5.setColor(i19);
                paint3.setColor(i19);
                if (unVar.Z9 != 0.0f || unVar.isInPreviewMode() || unVar.bb || (i10 = unVar.d4) == 3 || i10 == 1) {
                    rpVar = unVar.ba;
                    if (rpVar == null) {
                        rpVar.O = 0.0f;
                        rpVar.N = false;
                        return;
                    }
                    return;
                }
                canvas2.save();
                if (unVar.ga != 0.0f) {
                    float measuredHeight2 = unVar.x0.getMeasuredHeight() - unVar.Z9;
                    un unVar2 = unVar.fa;
                    f11 = (measuredHeight2 + (unVar2 == null ? 0.0f : unVar2.aa)) * unVar.ga;
                } else {
                    f11 = 0.0f;
                }
                canvas2.translate(0.0f, (getMeasuredHeight() - unVar.Na) - f11);
                if (unVar.ba == null) {
                    i13 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
                    rp rpVar2 = new rp(i13, unVar.fragmentView, unVar.f6, unVar.Ga, unVar.Ha, unVar.b(), unVar.qa);
                    unVar.ba = rpVar2;
                    rpVar2.S = unVar.Rc.e;
                    ArrayList arrayList = unVar.Bb;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        unVar.ba.i((TLRPC.Chat) unVar.Bb.get(0));
                    } else if (unVar.t4) {
                        unVar.ba.j();
                    } else {
                        unVar.ba.h();
                    }
                    unVar.ba.f();
                }
                rp rpVar3 = unVar.ba;
                int measuredWidth2 = getMeasuredWidth() - (unVar.L9() ? AndroidUtilities.dp(71.0f) : 0);
                ImageReceiver imageReceiver = rpVar3.F;
                TextPaint textPaint = rpVar3.f;
                TextPaint textPaint2 = rpVar3.h;
                boolean z12 = rpVar3.X;
                if (measuredWidth2 != rpVar3.c || (z12 && (tL_forumTopic = rpVar3.H) != null && rpVar3.I != tL_forumTopic.id)) {
                    rpVar3.d = AndroidUtilities.dp(56.0f) / f10;
                    rpVar3.c = measuredWidth2;
                    TLRPC.Chat chat = rpVar3.G;
                    if (chat != null) {
                        string = chat.title;
                    } else {
                        TLRPC.TL_forumTopic tL_forumTopic2 = rpVar3.H;
                        if (tL_forumTopic2 != null) {
                            string = tL_forumTopic2.title;
                        } else {
                            if (z12) {
                                i11 = 0;
                                string = LocaleController.formatString(R.string.SwipeToGoNextTopicEnd, MessagesController.getInstance(rpVar3.e0).getChat(Long.valueOf(-rpVar3.i0)).title);
                            } else {
                                i11 = 0;
                                string = LocaleController.getString(R.string.SwipeToGoNextChannelEnd);
                            }
                            int measureText = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                            rpVar3.x = measureText;
                            int g7 = d3.g(60.0f, rpVar3.c, measureText);
                            rpVar3.x = g7;
                            rpVar3.s = org.telegram.ui.Components.px0.c(string, textPaint, g7, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, g7, 1, true);
                            if (!rpVar3.V) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextRecommendedChannel);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextRecommendedChannel);
                            } else if (z12) {
                                string2 = LocaleController.getString(R.string.SwipeToGoNextUnreadTopic);
                                string3 = LocaleController.getString(R.string.ReleaseToGoNextUnreadTopic);
                            } else {
                                boolean z13 = rpVar3.W;
                                if (z13 && (i12 = rpVar3.a) != rpVar3.f0 && i12 != 0) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextArchive);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextArchive);
                                } else if (z13) {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextFolder);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextFolder);
                                } else {
                                    string2 = LocaleController.getString(R.string.SwipeToGoNextChannel);
                                    string3 = LocaleController.getString(R.string.ReleaseToGoNextChannel);
                                }
                            }
                            int measureText2 = (int) textPaint2.measureText(string2);
                            rpVar3.y = measureText2;
                            rpVar3.y = d3.g(60.0f, rpVar3.c, measureText2);
                            int i20 = rpVar3.y;
                            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                            rpVar3.v = new StaticLayout(string2, textPaint2, i20, alignment, 1.0f, 0.0f, false);
                            int measureText3 = (int) textPaint2.measureText(string3);
                            rpVar3.E = measureText3;
                            rpVar3.E = d3.g(60.0f, rpVar3.c, measureText3);
                            rpVar3.w = new StaticLayout(string3, textPaint2, rpVar3.E, alignment, 1.0f, 0.0f, false);
                            imageReceiver.setImageCoords((rpVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + rpVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                            imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                            rpVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                            if (z12) {
                                rpVar3.I = rpVar3.H == null ? 0L : r3.id;
                            }
                        }
                    }
                    i11 = 0;
                    int measureText4 = (int) textPaint.measureText((CharSequence) string, i11, string.length());
                    rpVar3.x = measureText4;
                    int g72 = d3.g(60.0f, rpVar3.c, measureText4);
                    rpVar3.x = g72;
                    rpVar3.s = org.telegram.ui.Components.px0.c(string, textPaint, g72, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, g72, 1, true);
                    if (!rpVar3.V) {
                    }
                    int measureText22 = (int) textPaint2.measureText(string2);
                    rpVar3.y = measureText22;
                    rpVar3.y = d3.g(60.0f, rpVar3.c, measureText22);
                    int i202 = rpVar3.y;
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    rpVar3.v = new StaticLayout(string2, textPaint2, i202, alignment2, 1.0f, 0.0f, false);
                    int measureText32 = (int) textPaint2.measureText(string3);
                    rpVar3.E = measureText32;
                    rpVar3.E = d3.g(60.0f, rpVar3.c, measureText32);
                    rpVar3.w = new StaticLayout(string3, textPaint2, rpVar3.E, alignment2, 1.0f, 0.0f, false);
                    imageReceiver.setImageCoords((rpVar3.c / f10) - (AndroidUtilities.dp(40.0f) / f10), (AndroidUtilities.dp(12.0f) + rpVar3.d) - (AndroidUtilities.dp(40.0f) / f10), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    imageReceiver.setRoundRadius((int) (AndroidUtilities.dp(40.0f) / f10));
                    rpVar3.c0.d(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(100.0f));
                    if (z12) {
                    }
                }
                float min = Math.min(1.0f, unVar.Z9 / AndroidUtilities.dp(110.0f));
                canvas2.translate(unVar.L9() ? AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(71.0f), unVar.a9()) : 0.0f, -(unVar.g9(org.telegram.ui.Components.a41.c) + unVar.S.getInputBubbleHeight() + unVar.v.d() + AndroidUtilities.dp(10.0f)));
                unVar.ba.a(canvas2, unVar.x0, min, 1.0f - unVar.ga);
                canvas2.restore();
                if (unVar.fa != null) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, r2.x0.getMeasuredWidth(), unVar.fa.x0.getMeasuredHeight(), (int) (unVar.ga * f7), 31);
                    canvas2.translate(0.0f, (getMeasuredHeight() - unVar.Z9) - f11);
                    unVar.fa.x0.draw(canvas2);
                    canvas2.restore();
                    return;
                }
                return;
            }
        }
        canvas2 = canvas;
        f7 = 255.0f;
        f10 = 2.0f;
        if (unVar.Z9 != 0.0f) {
        }
        rpVar = unVar.ba;
        if (rpVar == null) {
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (this.H3.h != null) {
            return;
        }
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfo.CollectionInfo collectionInfo = accessibilityNodeInfo.getCollectionInfo();
        if (collectionInfo != null) {
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(collectionInfo.getRowCount(), 1, false));
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wh.i iVar;
        org.telegram.ui.ActionBar.k kVar;
        un unVar = this.H3;
        nm nmVar = unVar.o9;
        nmVar.getClass();
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(nmVar.f0);
            nmVar.z = false;
        }
        if (this.V1 || ((iVar = unVar.ja) != null && iVar.a())) {
            return false;
        }
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
        if (!kVar.q() && !unVar.J9()) {
            E1(motionEvent);
        }
        return onInterceptTouchEvent;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        oj ojVar;
        fm fmVar;
        View view;
        MessageObject messageObject;
        un unVar = this.H3;
        if (unVar.kb && unVar.jb && getMeasuredHeight() > 0 && getPaddingTop() > 0 && unVar.A0 != null) {
            unVar.kb = false;
            unVar.z0.G = false;
            MessageObject messageObject2 = (MessageObject) unVar.A6[0].get(unVar.lb);
            int indexOf = messageObject2 != null ? unVar.G6.indexOf(messageObject2) : -1;
            if (indexOf >= 0) {
                unVar.z0.i1(unVar.A0.J + indexOf, Math.max(AndroidUtilities.dp(50.0f) + unVar.U8(messageObject2), AndroidUtilities.dp(102.0f)), false);
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        if (unVar.lb != 0 && (ojVar = unVar.x0) != null && (fmVar = unVar.A0) != null && !fmVar.N && !ojVar.V1) {
            int childCount = ojVar.getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    view = null;
                    break;
                }
                view = unVar.x0.getChildAt(i14);
                if ((view instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) view).getMessageObject()) != null && messageObject.getId() == unVar.lb && messageObject.getDialogId() == unVar.f6) {
                    break;
                } else {
                    i14++;
                }
            }
            if (view != null) {
                int i15 = unVar.mb;
                if (i15 != Integer.MIN_VALUE) {
                    int top = view.getTop() - i15;
                    if (top != 0) {
                        unVar.x0.scrollBy(0, top);
                    }
                } else if (unVar.x0.getPaddingTop() > 0 && !unVar.kb) {
                    unVar.mb = view.getTop();
                }
            } else if (unVar.mb != Integer.MIN_VALUE) {
                unVar.lb = 0;
                unVar.mb = TLObject.FLAG_31;
            }
        }
        int i16 = this.h3;
        int i17 = i12 - i10;
        if (i16 != i17) {
            if (i16 != 0) {
                unVar.r9(false);
            }
            this.h3 = i17;
        }
        int measuredHeight = getMeasuredHeight();
        if (this.G3 != measuredHeight) {
            this.F3 = true;
            qj qjVar = unVar.y0;
            if (qjVar != null) {
                qjVar.g();
            }
            unVar.i9.a();
            this.F3 = false;
            this.G3 = measuredHeight;
        }
        unVar.d6 = false;
        nm nmVar = unVar.o9;
        if (nmVar != null && nmVar.x()) {
            unVar.o9.w();
        }
        unVar.y9();
        unVar.M9();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        rp rpVar;
        un unVar = this.H3;
        oe.b bVar = unVar.Rc;
        nm nmVar = unVar.o9;
        nmVar.getClass();
        final int i10 = 3;
        final int i11 = 0;
        final int i12 = 1;
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(nmVar.f0);
            nmVar.z = false;
        }
        if (motionEvent.getAction() == 0) {
            unVar.Ea = true;
        }
        if (unVar.Z9 != 0.0f && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            float min = Math.min(1.0f, unVar.Z9 / AndroidUtilities.dp(110.0f));
            final int i13 = 2;
            if (motionEvent.getAction() != 1 || min != 1.0f || (rpVar = unVar.ba) == null || rpVar.R) {
                rp rpVar2 = unVar.ba;
                if (rpVar2 != null && rpVar2.R) {
                    long currentTimeMillis = System.currentTimeMillis();
                    rp rpVar3 = unVar.ba;
                    if (currentTimeMillis - rpVar3.U < 500 && rpVar3.M) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        unVar.ca = animatorSet;
                        if (unVar.ba != null) {
                            bVar.a(false, true);
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(unVar.Z9, AndroidUtilities.dp(111.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.mj
                            public final /* synthetic */ oj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i12) {
                                    case 0:
                                        un unVar2 = this.b.H3;
                                        unVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        un unVar3 = this.b.H3;
                                        unVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        un unVar4 = this.b.H3;
                                        unVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar4.x0.invalidate();
                                        break;
                                    default:
                                        un unVar5 = this.b.H3;
                                        unVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat.setDuration(400L);
                        ofFloat.setInterpolator(org.telegram.ui.Components.ds.f);
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(AndroidUtilities.dp(111.0f), 0.0f);
                        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.mj
                            public final /* synthetic */ oj b;

                            {
                                this.b = this;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i13) {
                                    case 0:
                                        un unVar2 = this.b.H3;
                                        unVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar2.x0.invalidate();
                                        break;
                                    case 1:
                                        un unVar3 = this.b.H3;
                                        unVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar3.x0.invalidate();
                                        break;
                                    case 2:
                                        un unVar4 = this.b.H3;
                                        unVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar4.x0.invalidate();
                                        break;
                                    default:
                                        un unVar5 = this.b.H3;
                                        unVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                        unVar5.x0.invalidate();
                                        break;
                                }
                            }
                        });
                        ofFloat2.setStartDelay(600L);
                        ofFloat2.setDuration(250L);
                        ofFloat2.setInterpolator(mi.m.V);
                        animatorSet.playSequentially(ofFloat, ofFloat2);
                        animatorSet.start();
                    }
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(unVar.Z9, 0.0f);
                unVar.ca = ofFloat3;
                if (unVar.ba != null) {
                    bVar.a(false, true);
                }
                ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.mj
                    public final /* synthetic */ oj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i10) {
                            case 0:
                                un unVar2 = this.b.H3;
                                unVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar2.x0.invalidate();
                                break;
                            case 1:
                                un unVar3 = this.b.H3;
                                unVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar3.x0.invalidate();
                                break;
                            case 2:
                                un unVar4 = this.b.H3;
                                unVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar4.x0.invalidate();
                                break;
                            default:
                                un unVar5 = this.b.H3;
                                unVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat3.setDuration(250L);
                ofFloat3.setInterpolator(mi.m.V);
                ofFloat3.start();
            } else if (rpVar.K != 1.0f) {
                float f7 = unVar.Z9;
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f7, AndroidUtilities.dp(8.0f) + f7);
                unVar.ca = ofFloat4;
                ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: org.telegram.ui.mj
                    public final /* synthetic */ oj b;

                    {
                        this.b = this;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                un unVar2 = this.b.H3;
                                unVar2.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar2.x0.invalidate();
                                break;
                            case 1:
                                un unVar3 = this.b.H3;
                                unVar3.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar3.x0.invalidate();
                                break;
                            case 2:
                                un unVar4 = this.b.H3;
                                unVar4.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar4.x0.invalidate();
                                break;
                            default:
                                un unVar5 = this.b.H3;
                                unVar5.Z9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                unVar5.x0.invalidate();
                                break;
                        }
                    }
                });
                ofFloat4.setDuration(200L);
                org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
                ofFloat4.setInterpolator(dsVar);
                ofFloat4.start();
                final rp rpVar4 = unVar.ba;
                ui uiVar = new ui(this, i13);
                AnimatorSet animatorSet2 = rpVar4.J;
                if (animatorSet2 != null) {
                    animatorSet2.removeAllListeners();
                    rpVar4.J.cancel();
                }
                rpVar4.Y = uiVar;
                rpVar4.J = new AnimatorSet();
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(rpVar4.K, 1.0f);
                ofFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.pp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i11) {
                            case 0:
                                rp rpVar5 = rpVar4;
                                rpVar5.getClass();
                                rpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rpVar5.T.invalidate();
                                View view = rpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                rp rpVar6 = rpVar4;
                                rpVar6.getClass();
                                rpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = rpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                ValueAnimator ofFloat6 = ValueAnimator.ofFloat(rpVar4.L, 0.0f);
                ofFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.pp
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        switch (i12) {
                            case 0:
                                rp rpVar5 = rpVar4;
                                rpVar5.getClass();
                                rpVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                rpVar5.T.invalidate();
                                View view = rpVar5.a0;
                                if (view != null) {
                                    view.invalidate();
                                    break;
                                }
                                break;
                            default:
                                rp rpVar6 = rpVar4;
                                rpVar6.getClass();
                                rpVar6.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                View view2 = rpVar6.a0;
                                if (view2 != null) {
                                    view2.invalidate();
                                    break;
                                }
                                break;
                        }
                    }
                });
                rpVar4.J.addListener(new qp(rpVar4, i11));
                rpVar4.J.playTogether(ofFloat5, ofFloat6);
                rpVar4.J.setDuration(120L);
                rpVar4.J.setInterpolator(dsVar);
                rpVar4.J.start();
            } else {
                un.Z1(unVar);
            }
        }
        if (!this.V1) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            kVar = ((org.telegram.ui.ActionBar.r2) unVar).actionBar;
            if (kVar.q() || unVar.J9()) {
                return onTouchEvent;
            }
            E1(motionEvent);
            if (unVar.r9 || onTouchEvent) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (this.H3.c9 != null) {
            return false;
        }
        return super.requestChildRectangleOnScreen(view, rect, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        org.telegram.ui.Components.an0 C4;
        org.telegram.ui.Components.pb1 pb1Var;
        super.requestDisallowInterceptTouchEvent(z10);
        View view = this.H3.p9;
        if (view != null) {
            if ((view instanceof org.telegram.ui.Cells.s1) && (C4 = ((org.telegram.ui.Cells.s1) view).C4()) != null && (pb1Var = C4.n) != null && C4.r && pb1Var.w && !pb1Var.D) {
                if (!pb1Var.x) {
                    return;
                }
                if (!pb1Var.y && (pb1Var.K & 3) != 1) {
                    return;
                }
            }
            E1(null);
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.F3) {
            return;
        }
        jh.a aVar = this.H3.mc;
        if (aVar.b != 0) {
            int childCount = aVar.a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                aVar.a.getChildAt(i10).forceLayout();
            }
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView
    public final void setItemAnimator(s4.m0 m0Var) {
        if (this.V1) {
            return;
        }
        super.setItemAnimator(m0Var);
    }

    @Override // org.telegram.ui.Components.mm0, android.view.View
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            un unVar = this.H3;
            unVar.x9();
            unVar.z9();
        }
    }
}
