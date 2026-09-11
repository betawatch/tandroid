package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class jb extends sb {
    public final /* synthetic */ ub X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(ub ubVar, Context context) {
        super(context, null);
        this.X2 = ubVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
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
            ub ubVar = this.X2;
            if (!z11) {
                ubVar.E.getClass();
                if (RecyclerView.R(t1Var) != -1) {
                    z10 = true;
                    if (!t1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y10 = (int) view.getY();
                    if (t1Var.j() && (b10 = ubVar.E.T(view).b()) >= 0) {
                        if (ubVar.E.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                    int layoutHeight = t1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = ubVar.E.getMeasuredHeight() - ubVar.E.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (t1Var.h() && (r13 = ubVar.E.T(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            s4.c1 K = ubVar.E.K(b11);
                            if (K == null) {
                                break;
                            }
                            View view2 = K.a;
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

    @Override // org.telegram.ui.Components.ll0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        ub ubVar = this.X2;
        if (ubVar.E != null && ubVar.G != null && (i14 = ubVar.R0) >= 0) {
            if (ubVar.Q0 != 0) {
                int i15 = 0;
                while (true) {
                    qb qbVar = ubVar.I;
                    if (i15 < qbVar.d) {
                        if (i15 < qbVar.f || i15 >= qbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = qbVar.n.s0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - qbVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == ubVar.Q0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            ubVar.G.i1(i14, ubVar.S0, true);
            ubVar.R0 = -1;
            ubVar.Q0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
