package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class lb extends ub {
    public final /* synthetic */ wb X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(wb wbVar, Context context) {
        super(context, null);
        this.X2 = wbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y3;
        int b10;
        if (view instanceof org.telegram.ui.Cells.u1) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            ((org.telegram.ui.Cells.u1) view).a(canvas);
            canvas.restore();
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if ((view instanceof org.telegram.ui.Cells.t1) && (avatarImage = (t1Var = (org.telegram.ui.Cells.t1) view).getAvatarImage()) != null) {
            boolean z11 = t1Var.getMessageObject().deleted;
            wb wbVar = this.X2;
            if (!z11) {
                wbVar.v.getClass();
                if (RecyclerView.S(t1Var) != -1) {
                    z10 = true;
                    if (!t1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y10 = (int) view.getY();
                    if (t1Var.j() && (b10 = wbVar.v.U(view).b()) >= 0) {
                        if (wbVar.v.L(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                    int layoutHeight = t1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = wbVar.v.getMeasuredHeight() - wbVar.v.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (t1Var.h() && (r13 = wbVar.v.U(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            s4.c1 L = wbVar.v.L(b11);
                            if (L == null) {
                                break;
                            }
                            View view2 = L.a;
                            int top = view2.getTop();
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.h()) {
                                    y10 = top;
                                }
                            }
                            y10 = top;
                            break;
                        }
                    }
                    if (layoutHeight - AndroidUtilities.dp(48.0f) < y10) {
                        layoutHeight = AndroidUtilities.dp(48.0f) + y10;
                    }
                    if (!t1Var.j() && layoutHeight > (y3 = (int) (t1Var.getY() + t1Var.getMeasuredHeight()))) {
                        layoutHeight = y3;
                    }
                    canvas.save();
                    if (checkBoxTranslation != 0.0f) {
                        canvas.translate(checkBoxTranslation, 0.0f);
                    }
                    if (t1Var.getCurrentMessagesGroup() != null && t1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        layoutHeight = (int) (layoutHeight - t1Var.getTranslationY());
                    }
                    if (z10) {
                        avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                    }
                    if (t1Var.a()) {
                        avatarImage.setAlpha(t1Var.getAlpha());
                        canvas.scale(t1Var.getScaleX(), t1Var.getScaleY(), t1Var.getPivotX() + t1Var.getX(), t1Var.getY() + (t1Var.getHeight() >> 1));
                    } else {
                        avatarImage.setAlpha(1.0f);
                    }
                    if (z10) {
                        avatarImage.setVisible(true, false);
                    }
                    avatarImage.draw(canvas);
                    canvas.restore();
                }
            }
            z10 = false;
            if (!t1Var.getMessageObject().deleted) {
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ml0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        wb wbVar = this.X2;
        if (wbVar.v != null && wbVar.x != null && (i14 = wbVar.N0) >= 0) {
            if (wbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    sb sbVar = wbVar.E;
                    if (i15 < sbVar.d) {
                        if (i15 < sbVar.f || i15 >= sbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = sbVar.n.o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - sbVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == wbVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            wbVar.x.i1(i14, wbVar.O0, true);
            wbVar.N0 = -1;
            wbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
