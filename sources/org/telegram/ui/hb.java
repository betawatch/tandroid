package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class hb extends qb {
    public final /* synthetic */ sb U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(sb sbVar, Context context) {
        super(context, null);
        this.U2 = sbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver avatarImage;
        boolean z4;
        int y10;
        int b10;
        if (view instanceof org.telegram.ui.Cells.u1) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            ((org.telegram.ui.Cells.u1) view).a(canvas);
            canvas.restore();
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if ((view instanceof org.telegram.ui.Cells.t1) && (avatarImage = (t1Var = (org.telegram.ui.Cells.t1) view).getAvatarImage()) != null) {
            boolean z10 = t1Var.getMessageObject().deleted;
            sb sbVar = this.U2;
            if (!z10) {
                sbVar.B.getClass();
                if (RecyclerView.R(t1Var) != -1) {
                    z4 = true;
                    if (!t1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y11 = (int) view.getY();
                    if (t1Var.j() && (b10 = sbVar.B.T(view).b()) >= 0) {
                        if (sbVar.B.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                    int layoutHeight = t1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = sbVar.B.getMeasuredHeight() - sbVar.B.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (t1Var.h() && (r13 = sbVar.B.T(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            f2.m1 K = sbVar.B.K(b11);
                            if (K == null) {
                                break;
                            }
                            View view2 = K.a;
                            int top = view2.getTop();
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.h()) {
                                    y11 = top;
                                }
                            }
                            y11 = top;
                            break;
                        }
                    }
                    if (layoutHeight - AndroidUtilities.dp(48.0f) < y11) {
                        layoutHeight = AndroidUtilities.dp(48.0f) + y11;
                    }
                    if (!t1Var.j() && layoutHeight > (y10 = (int) (t1Var.getY() + t1Var.getMeasuredHeight()))) {
                        layoutHeight = y10;
                    }
                    canvas.save();
                    if (checkBoxTranslation != 0.0f) {
                        canvas.translate(checkBoxTranslation, 0.0f);
                    }
                    if (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        layoutHeight = (int) (layoutHeight - t1Var.getTranslationY());
                    }
                    if (z4) {
                        avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                    }
                    if (t1Var.a()) {
                        avatarImage.setAlpha(t1Var.getAlpha());
                        canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX() + t1Var.getX(), t1Var.getY() + (t1Var.getHeight() >> 1));
                    } else {
                        avatarImage.setAlpha(1.0f);
                    }
                    if (z4) {
                        avatarImage.setVisible(true, false);
                    }
                    avatarImage.draw(canvas);
                    canvas.restore();
                }
            }
            z4 = false;
            if (!t1Var.getMessageObject().deleted) {
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        sb sbVar = this.U2;
        if (sbVar.B != null && sbVar.D != null && (i14 = sbVar.O0) >= 0) {
            if (sbVar.N0 != 0) {
                int i15 = 0;
                while (true) {
                    ob obVar = sbVar.F;
                    if (i15 < obVar.d) {
                        if (i15 < obVar.f || i15 >= obVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = obVar.n.p0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - obVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == sbVar.N0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            sbVar.D.i1(i14, sbVar.P0, true);
            sbVar.O0 = -1;
            sbVar.N0 = 0L;
        }
        super.onLayout(z4, i10, i11, i12, i13);
    }
}
