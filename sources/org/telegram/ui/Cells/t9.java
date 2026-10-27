package org.telegram.ui.Cells;

import a8.ye;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class t9 extends fa {
    public final SparseArray p0 = new SparseArray();
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;

    @Override // org.telegram.ui.Cells.fa
    public final boolean C() {
        aa aaVar;
        RichMessageLayout richMessageLayout;
        CharSequence r6;
        String str;
        if (this.u0 && (aaVar = this.W) != null && ((s1) aaVar).getMessageObject() != null && (richMessageLayout = ((s1) this.W).getMessageObject().richLayout) != null && !richMessageLayout.textBlocks.isEmpty() && (r6 = r()) != null && r6.length() != 0) {
            try {
                str = richMessageLayout.getSelectionHtml(this.u, this.v);
            } catch (Exception e) {
                FileLog.e(e);
                str = null;
            }
            if (str != null && str.length() != 0) {
                AndroidUtilities.addToClipboard(r6, str);
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Cells.fa
    public final void E(boolean z10) {
        aa aaVar = this.W;
        if (aaVar == null || !((s1) aaVar).g3() || z10) {
            return;
        }
        s1 s1Var = (s1) this.W;
        int id2 = s1Var.getMessageObject().getId();
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(id2);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        s1Var.setSelectedBackgroundProgress(0.01f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.01f, 1.0f);
        int i10 = 1;
        ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.u2(s1Var, id2, i10));
        ofFloat.addListener(new i1(i10, s1Var));
        ofFloat.setDuration(300L);
        ofFloat.start();
        sparseArray.put(id2, ofFloat);
    }

    @Override // org.telegram.ui.Cells.fa
    public final void L(aa aaVar, aa aaVar2) {
        s1 s1Var = (s1) aaVar;
        s1 s1Var2 = (s1) aaVar2;
        boolean z10 = s1Var2 == null || !(s1Var2.getMessageObject() == null || s1Var2.getMessageObject().getId() == s1Var.getMessageObject().getId());
        this.w = s1Var.getMessageObject().getId();
        try {
            int i10 = s1Var.getMessageObject().messageOwner.edit_date;
        } catch (Exception unused) {
        }
        this.U = 0.0f;
        this.q0 = this.r0;
        this.s0 = this.t0;
        this.u0 = this.v0;
        int i11 = this.w;
        SparseArray sparseArray = this.p0;
        Animator animator = (Animator) sparseArray.get(i11);
        if (animator != null) {
            animator.removeAllListeners();
            animator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new bh.a0(4, this, z10));
        ofFloat.setDuration(250L);
        ofFloat.start();
        sparseArray.put(this.w, ofFloat);
        if (!z10) {
            s1Var.setSelectedBackgroundProgress(0.0f);
        }
        SharedConfig.removeTextSelectionHint();
    }

    public final void W(MessageObject messageObject) {
        try {
            int i10 = messageObject.messageOwner.edit_date;
        } catch (Exception unused) {
        }
        if (this.w == messageObject.getId()) {
            f(true);
        }
    }

    public final void X(boolean z10, StaticLayout staticLayout, Canvas canvas) {
        if (this.q0) {
            Paint paint = this.p;
            Paint paint2 = this.o;
            if (z10) {
                int i10 = org.telegram.ui.ActionBar.y6.Vb;
                paint2.setColor(t(i10));
                paint.setColor(t(i10));
            } else {
                int i11 = org.telegram.ui.ActionBar.y6.uf;
                paint2.setColor(t(i11));
                paint.setColor(t(i11));
            }
            h(canvas, staticLayout, this.u, this.v, true, true, 0.0f);
        }
    }

    public final void Y(MessageObject messageObject, RichMessageLayout richMessageLayout, Canvas canvas) {
        aa aaVar;
        Canvas canvas2;
        if (!this.u0 || richMessageLayout == null || (aaVar = this.W) == null || ((s1) aaVar).getMessageObject() == null || ((s1) this.W).getMessageObject().getId() != messageObject.getId()) {
            return;
        }
        boolean isOutOwner = messageObject.isOutOwner();
        Paint paint = this.p;
        Paint paint2 = this.o;
        if (isOutOwner) {
            int i10 = org.telegram.ui.ActionBar.y6.Vb;
            paint2.setColor(t(i10));
            paint.setColor(t(i10));
        } else {
            int i11 = org.telegram.ui.ActionBar.y6.uf;
            paint2.setColor(t(i11));
            paint.setColor(t(i11));
        }
        int i12 = 0;
        while (i12 < richMessageLayout.textBlocks.size()) {
            Layout layout = richMessageLayout.textBlocks.get(i12).getLayout();
            if (layout != null && layout.getText() != null) {
                int intValue = richMessageLayout.textBlockCharOffsets.get(i12).intValue();
                int length = layout.getText().length();
                int clamp = Utilities.clamp(this.u - intValue, length, 0);
                int clamp2 = Utilities.clamp(this.v - intValue, length, 0);
                if (clamp != clamp2) {
                    boolean z10 = this.u >= intValue;
                    boolean z11 = this.v <= intValue + length;
                    canvas.save();
                    canvas.translate(r1.getX(), r1.getY());
                    canvas2 = canvas;
                    h(canvas2, layout, clamp, clamp2, z10, z11, 0.0f);
                    canvas2.restore();
                    i12++;
                    canvas = canvas2;
                }
            }
            canvas2 = canvas;
            i12++;
            canvas = canvas2;
        }
    }

    public final void Z(s1 s1Var, int i10, int i11) {
        if (s1Var == null) {
            return;
        }
        this.W = s1Var;
        this.w = s1Var.getMessageObject().getId();
        boolean z10 = ((s1) this.W).getMessageObject().type == 36 && ((s1) this.W).getMessageObject().richLayout != null;
        this.u0 = z10;
        if (z10) {
            this.q0 = false;
            this.s0 = false;
        }
        this.u = i10;
        this.v = i11;
        w();
        ye yeVar = this.D;
        if (yeVar != null) {
            yeVar.a(true);
        }
        this.g = 0.0f;
        this.f = 0.0f;
        this.e = false;
        ea eaVar = this.C;
        if (eaVar != null) {
            eaVar.setVisibility(0);
        }
        U();
    }

    public final void a0(s1 s1Var) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        RichMessageLayout richMessageLayout;
        this.X = s1Var;
        MessageObject messageObject = s1Var.getMessageObject();
        r1 r1Var = s1Var.Zc;
        boolean z10 = this.r0;
        Rect rect = this.B;
        if (z10 && s1Var.getDescriptionlayout() != null) {
            int i10 = this.c;
            rect.set(i10, this.d, s1Var.getDescriptionlayout().getWidth() + i10, s1Var.getDescriptionlayout().getHeight() + this.d);
            return;
        }
        if (this.t0 && s1Var.getFactCheckLayout() != null) {
            int i11 = this.c;
            rect.set(i11, this.d, s1Var.getFactCheckLayout().getWidth() + i11, s1Var.getFactCheckLayout().getHeight() + this.d);
            return;
        }
        if (this.v0 && messageObject != null && (richMessageLayout = messageObject.richLayout) != null && !richMessageLayout.textBlocks.isEmpty()) {
            RichMessageLayout richMessageLayout2 = messageObject.richLayout;
            int i12 = this.c;
            rect.set(i12, this.d, richMessageLayout2.getMinWidth() + i12, richMessageLayout2.getHeight() + this.d);
        } else if (s1Var.P2() && s1Var.getCaptionLayout().textLayoutBlocks.size() > 0) {
            MessageObject.TextLayoutBlock textLayoutBlock = (MessageObject.TextLayoutBlock) ic.a.g(1, s1Var.getCaptionLayout().textLayoutBlocks);
            int i13 = this.c;
            rect.set(i13, this.d, textLayoutBlock.textLayout.getWidth() + i13, (int) (textLayoutBlock.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks, r1Var) + this.d + textLayoutBlock.padTop + textLayoutBlock.textLayout.getHeight()));
        } else {
            if (messageObject == null || (arrayList = messageObject.textLayoutBlocks) == null || arrayList.size() <= 0) {
                this.X = null;
                return;
            }
            MessageObject.TextLayoutBlock textLayoutBlock2 = (MessageObject.TextLayoutBlock) ic.a.g(1, messageObject.textLayoutBlocks);
            int i14 = this.c;
            rect.set(i14, this.d, textLayoutBlock2.textLayout.getWidth() + i14, (int) (textLayoutBlock2.textYOffset(messageObject.textLayoutBlocks, r1Var) + this.d + textLayoutBlock2.padTop + textLayoutBlock2.textLayout.getHeight()));
        }
    }

    public final void b0(int i10, int i11) {
        if (this.a == i10 && this.b == i11) {
            return;
        }
        this.a = i10;
        this.b = i11;
        w();
    }

    @Override // org.telegram.ui.Cells.fa
    public final void f(boolean z10) {
        super.f(z10);
        this.q0 = false;
        this.s0 = false;
        this.u0 = false;
    }

    @Override // org.telegram.ui.Cells.fa
    public final void i(int i10, v9 v9Var, boolean z10) {
        s1 s1Var = (s1) (z10 ? this.X : this.W);
        if (s1Var == null) {
            v9Var.b = null;
            return;
        }
        MessageObject messageObject = s1Var.getMessageObject();
        if (this.q0) {
            v9Var.b = s1Var.getDescriptionlayout();
            v9Var.c = 0.0f;
            v9Var.d = 0.0f;
            v9Var.a = 0;
            return;
        }
        if (this.s0) {
            v9Var.b = s1Var.getFactCheckLayout();
            v9Var.c = 0.0f;
            v9Var.d = 0.0f;
            v9Var.a = 0;
            return;
        }
        if (this.u0) {
            RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
            if (richMessageLayout == null || richMessageLayout.textBlocks.isEmpty()) {
                v9Var.b = null;
                return;
            }
            while (true) {
                if (r4 >= richMessageLayout.textBlocks.size()) {
                    r4 = -1;
                    break;
                }
                int intValue = richMessageLayout.textBlockCharOffsets.get(r4).intValue();
                int length = richMessageLayout.textBlocks.get(r4).getLayout().getText().length();
                if (i10 >= intValue && i10 <= intValue + length) {
                    break;
                } else {
                    r4++;
                }
            }
            if (r4 < 0) {
                r4 = richMessageLayout.textBlocks.size() - 1;
            }
            v9Var.b = richMessageLayout.textBlocks.get(r4).getLayout();
            v9Var.c = r9.getY();
            v9Var.d = r9.getX();
            v9Var.a = richMessageLayout.textBlockCharOffsets.get(r4).intValue();
            return;
        }
        if (s1Var.P2()) {
            MessageObject.TextLayoutBlocks captionLayout = s1Var.getCaptionLayout();
            if (captionLayout.textLayoutBlocks.size() == 1) {
                v9Var.b = captionLayout.textLayoutBlocks.get(0).textLayout;
                v9Var.c = r9.padTop;
                MessageObject.TextLayoutBlock textLayoutBlock = captionLayout.textLayoutBlocks.get(0);
                float f7 = -(textLayoutBlock.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                v9Var.d = f7;
                if (textLayoutBlock.code && !textLayoutBlock.quote) {
                    v9Var.d = f7 + AndroidUtilities.dp(8.0f);
                }
                v9Var.a = 0;
                return;
            }
            for (int i11 = 0; i11 < captionLayout.textLayoutBlocks.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock2 = captionLayout.textLayoutBlocks.get(i11);
                int i12 = i10 - textLayoutBlock2.charactersOffset;
                if (i12 >= 0 && i12 <= textLayoutBlock2.textLayout.getText().length()) {
                    v9Var.b = textLayoutBlock2.textLayout;
                    v9Var.c = textLayoutBlock2.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock2.padTop;
                    float f10 = -(textLayoutBlock2.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock2.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                    v9Var.d = f10;
                    if (textLayoutBlock2.code && !textLayoutBlock2.quote) {
                        v9Var.d = f10 + AndroidUtilities.dp(8.0f);
                    }
                    v9Var.a = textLayoutBlock2.charactersOffset;
                    return;
                }
            }
            v9Var.b = null;
            return;
        }
        ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
        if (arrayList == null) {
            v9Var.b = null;
            return;
        }
        if (arrayList.size() == 1) {
            v9Var.b = messageObject.textLayoutBlocks.get(0).textLayout;
            v9Var.c = r9.padTop;
            MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(0);
            float f11 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
            v9Var.d = f11;
            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                v9Var.d = f11 + AndroidUtilities.dp(8.0f);
            }
            v9Var.a = 0;
            return;
        }
        for (int i13 = 0; i13 < messageObject.textLayoutBlocks.size(); i13++) {
            MessageObject.TextLayoutBlock textLayoutBlock4 = messageObject.textLayoutBlocks.get(i13);
            int i14 = i10 - textLayoutBlock4.charactersOffset;
            if (i14 >= 0 && i14 <= textLayoutBlock4.textLayout.getText().length()) {
                v9Var.b = textLayoutBlock4.textLayout;
                v9Var.c = textLayoutBlock4.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock4.padTop;
                float f12 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                v9Var.d = f12;
                if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                    v9Var.d = f12 + AndroidUtilities.dp(8.0f);
                }
                v9Var.a = textLayoutBlock4.charactersOffset;
                return;
            }
        }
        v9Var.b = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Cells.fa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int k(int i10, int i11, int i12, int i13, aa aaVar, boolean z10) {
        Layout layout;
        float textYOffset;
        int i14;
        float f7;
        float f10;
        Layout layout2;
        int i15;
        Layout layout3;
        s1 s1Var = (s1) aaVar;
        if (s1Var == null) {
            return 0;
        }
        int i16 = i10 - i12;
        int i17 = i11 - i13;
        boolean z11 = z10 ? this.r0 : this.q0;
        boolean z12 = z10 ? this.t0 : this.s0;
        boolean z13 = z10 ? this.v0 : this.u0;
        if (z11) {
            layout2 = s1Var.getDescriptionlayout();
        } else {
            if (!z12) {
                if (z13) {
                    RichMessageLayout richMessageLayout = s1Var.getMessageObject() != null ? s1Var.getMessageObject().richLayout : null;
                    if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                        da daVar = (da) ic.a.g(1, richMessageLayout.textBlocks);
                        layout = daVar.getLayout();
                        f7 = daVar.getY();
                    }
                    return -1;
                }
                if (s1Var.P2()) {
                    MessageObject.TextLayoutBlock textLayoutBlock = s1Var.getCaptionLayout().textLayoutBlocks.get(s1Var.getCaptionLayout().textLayoutBlocks.size() - 1);
                    layout = textLayoutBlock.textLayout;
                    textYOffset = textLayoutBlock.textYOffset(s1Var.getCaptionLayout().textLayoutBlocks);
                    i14 = textLayoutBlock.padTop;
                } else {
                    MessageObject.TextLayoutBlock textLayoutBlock2 = s1Var.getMessageObject().textLayoutBlocks.get(s1Var.getMessageObject().textLayoutBlocks.size() - 1);
                    layout = textLayoutBlock2.textLayout;
                    textYOffset = textLayoutBlock2.textYOffset(s1Var.getMessageObject().textLayoutBlocks);
                    i14 = textLayoutBlock2.padTop;
                }
                f7 = i14 + textYOffset;
                Layout layout4 = layout;
                f10 = f7;
                layout2 = layout4;
                if (layout2 != null) {
                    if (i17 < 0) {
                        i17 = 1;
                    }
                    int lineBottom = (int) (f10 + layout2.getLineBottom(layout2.getLineCount() - 1));
                    if (i17 > lineBottom) {
                        i17 = lineBottom - 1;
                    }
                    r1 r1Var = s1Var.Zc;
                    MessageObject messageObject = s1Var.getMessageObject();
                    v9 v9Var = this.a0;
                    if (!z10 ? this.q0 : this.r0) {
                        v9Var.b = s1Var.getDescriptionlayout();
                        v9Var.d = 0.0f;
                        v9Var.c = 0.0f;
                        v9Var.a = 0;
                    } else {
                        if (!z10 ? this.s0 : this.t0) {
                            if (!z10 ? !this.u0 : !this.v0) {
                                i15 = -1;
                                if (!s1Var.P2()) {
                                    int i18 = 0;
                                    while (true) {
                                        if (i18 >= messageObject.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock3 = messageObject.textLayoutBlocks.get(i18);
                                        float f11 = i17;
                                        if (f11 < textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) || f11 > textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop + textLayoutBlock3.height(r1Var)) {
                                            i18++;
                                        } else {
                                            v9Var.b = textLayoutBlock3.textLayout;
                                            v9Var.c = textLayoutBlock3.textYOffset(messageObject.textLayoutBlocks) + textLayoutBlock3.padTop;
                                            float f12 = -(textLayoutBlock3.isRtl() ? ((int) Math.ceil(messageObject.textXOffset)) - (textLayoutBlock3.quote ? AndroidUtilities.dp(10.0f) : textLayoutBlock3.code ? AndroidUtilities.dp(0.0f) : 0) : 0);
                                            v9Var.d = f12;
                                            if (textLayoutBlock3.code && !textLayoutBlock3.quote) {
                                                v9Var.d = f12 + AndroidUtilities.dp(8.0f);
                                            }
                                            v9Var.a = textLayoutBlock3.charactersOffset;
                                        }
                                    }
                                } else {
                                    MessageObject.TextLayoutBlocks captionLayout = s1Var.getCaptionLayout();
                                    int i19 = 0;
                                    while (true) {
                                        if (i19 >= captionLayout.textLayoutBlocks.size()) {
                                            break;
                                        }
                                        MessageObject.TextLayoutBlock textLayoutBlock4 = captionLayout.textLayoutBlocks.get(i19);
                                        float f13 = i17;
                                        if (f13 < textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) || f13 > textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop + textLayoutBlock4.height(r1Var)) {
                                            i19++;
                                        } else {
                                            v9Var.b = textLayoutBlock4.textLayout;
                                            v9Var.c = textLayoutBlock4.textYOffset(captionLayout.textLayoutBlocks) + textLayoutBlock4.padTop;
                                            float f14 = -(textLayoutBlock4.isRtl() ? ((int) Math.ceil(captionLayout.textXOffset)) - (textLayoutBlock4.quote ? AndroidUtilities.dp(10.0f) : 0) : 0);
                                            v9Var.d = f14;
                                            if (textLayoutBlock4.code && !textLayoutBlock4.quote) {
                                                v9Var.d = f14 + AndroidUtilities.dp(8.0f);
                                            }
                                            v9Var.a = textLayoutBlock4.charactersOffset;
                                        }
                                    }
                                }
                            } else {
                                RichMessageLayout richMessageLayout2 = messageObject != null ? messageObject.richLayout : null;
                                if (richMessageLayout2 == null || richMessageLayout2.textBlocks.isEmpty()) {
                                    i15 = -1;
                                    v9Var.b = null;
                                } else {
                                    int i20 = TLObject.FLAG_31;
                                    int i21 = -1;
                                    int i22 = -1;
                                    int i23 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                    for (int i24 = 0; i24 < richMessageLayout2.textBlocks.size(); i24++) {
                                        da daVar2 = richMessageLayout2.textBlocks.get(i24);
                                        int y3 = daVar2.getY();
                                        int height = daVar2.getLayout().getHeight() + y3;
                                        int x9 = daVar2.getX();
                                        int width = daVar2.getLayout().getWidth() + x9;
                                        boolean z14 = i17 >= y3 && i17 < height;
                                        boolean z15 = i16 >= x9 && i16 < width;
                                        daVar2.getLayout().getText();
                                        if (z14) {
                                            if (x9 <= i16 && x9 > i20) {
                                                i20 = x9;
                                                i21 = i24;
                                            }
                                            int min = z15 ? 0 : Math.min(Math.abs(i16 - x9), Math.abs(i16 - width));
                                            if (min < i23) {
                                                i23 = min;
                                                i22 = i24;
                                            }
                                        }
                                    }
                                    i15 = -1;
                                    if (i21 < 0) {
                                        i21 = i22;
                                    }
                                    if (i21 < 0) {
                                        int i25 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                        i21 = 0;
                                        for (int i26 = 0; i26 < richMessageLayout2.textBlocks.size(); i26++) {
                                            da daVar3 = richMessageLayout2.textBlocks.get(i26);
                                            int y10 = daVar3.getY();
                                            int min2 = Math.min(Math.abs(i17 - y10), Math.abs(i17 - (daVar3.getLayout().getHeight() + y10)));
                                            if (min2 < i25) {
                                                i21 = i26;
                                                i25 = min2;
                                            }
                                        }
                                    }
                                    v9Var.b = richMessageLayout2.textBlocks.get(i21).getLayout();
                                    v9Var.c = r2.getY();
                                    v9Var.d = r2.getX();
                                    v9Var.a = richMessageLayout2.textBlockCharOffsets.get(i21).intValue();
                                }
                            }
                            layout3 = v9Var.b;
                            if (layout3 != null) {
                                return i15;
                            }
                            int i27 = (int) (i16 - v9Var.d);
                            int i28 = 0;
                            while (true) {
                                if (i28 >= layout3.getLineCount()) {
                                    i28 = i15;
                                    break;
                                }
                                float f15 = i17;
                                if (f15 > v9Var.c + layout3.getLineTop(i28) && f15 < v9Var.c + layout3.getLineBottom(i28)) {
                                    break;
                                }
                                i28++;
                            }
                            if (i28 >= 0) {
                                return layout3.getOffsetForHorizontal(i28, i27) + v9Var.a;
                            }
                            return i15;
                        }
                        v9Var.b = s1Var.getFactCheckLayout();
                        v9Var.d = 0.0f;
                        v9Var.c = 0.0f;
                        v9Var.a = 0;
                    }
                    i15 = -1;
                    layout3 = v9Var.b;
                    if (layout3 != null) {
                    }
                }
                return -1;
            }
            layout2 = s1Var.getFactCheckLayout();
        }
        f10 = 0.0f;
        if (layout2 != null) {
        }
        return -1;
    }

    @Override // org.telegram.ui.Cells.fa
    public final int m() {
        Layout layout;
        aa aaVar = this.W;
        if (aaVar != null && ((s1) aaVar).getMessageObject() != null) {
            MessageObject messageObject = ((s1) this.W).getMessageObject();
            if (this.q0) {
                layout = ((s1) this.W).getDescriptionlayout();
            } else if (this.s0) {
                layout = ((s1) this.W).getFactCheckLayout();
            } else if (this.u0) {
                RichMessageLayout richMessageLayout = messageObject != null ? messageObject.richLayout : null;
                if (richMessageLayout != null && !richMessageLayout.textBlocks.isEmpty()) {
                    layout = richMessageLayout.textBlocks.get(0).getLayout();
                }
                layout = null;
            } else if (((s1) this.W).P2()) {
                layout = ((s1) this.W).getCaptionLayout().textLayoutBlocks.get(0).textLayout;
            } else {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                if (arrayList != null) {
                    layout = arrayList.get(0).textLayout;
                }
                layout = null;
            }
            if (layout != null) {
                return layout.getLineBottom(0) - layout.getLineTop(0);
            }
        }
        return 0;
    }

    @Override // org.telegram.ui.Cells.fa
    public final CharSequence s(aa aaVar, boolean z10) {
        s1 s1Var = (s1) aaVar;
        if (s1Var == null || s1Var.getMessageObject() == null) {
            return null;
        }
        if (!z10 ? !this.q0 : !this.r0) {
            return s1Var.getDescriptionlayout().getText();
        }
        if (!z10 ? !this.s0 : !this.t0) {
            return s1Var.getFactCheckLayout().getText();
        }
        if (!z10 ? this.u0 : this.v0) {
            return s1Var.P2() ? s1Var.getCaptionLayout().text : s1Var.getMessageObject().messageText;
        }
        RichMessageLayout richMessageLayout = s1Var.getMessageObject().richLayout;
        return richMessageLayout != null ? richMessageLayout.joinedText : "";
    }

    @Override // org.telegram.ui.Cells.fa
    public void w() {
        super.w();
        aa aaVar = this.W;
        if (aaVar != null && ((s1) aaVar).getCurrentMessagesGroup() != null) {
            this.F.invalidate();
        }
        aa aaVar2 = this.W;
        if (aaVar2 != null) {
            if (this.s0 || this.t0) {
                ((s1) aaVar2).a3();
            }
        }
    }
}
