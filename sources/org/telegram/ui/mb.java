package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class mb extends vb {
    public final /* synthetic */ xb V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(xb xbVar, Context context) {
        super(context, null);
        this.V2 = xbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y3;
        int b10;
        if (view instanceof org.telegram.ui.Cells.v1) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            ((org.telegram.ui.Cells.v1) view).a(canvas);
            canvas.restore();
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if ((view instanceof org.telegram.ui.Cells.u1) && (avatarImage = (u1Var = (org.telegram.ui.Cells.u1) view).getAvatarImage()) != null) {
            boolean z11 = u1Var.getMessageObject().deleted;
            xb xbVar = this.V2;
            if (!z11) {
                xbVar.v.getClass();
                if (RecyclerView.R(u1Var) != -1) {
                    z10 = true;
                    if (!u1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y10 = (int) view.getY();
                    if (u1Var.j() && (b10 = xbVar.v.T(view).b()) >= 0) {
                        if (xbVar.v.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = u1Var.getCheckBoxTranslation() + u1Var.getSlidingOffsetX();
                    int layoutHeight = u1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = xbVar.v.getMeasuredHeight() - xbVar.v.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (u1Var.h() && (r13 = xbVar.v.T(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            s4.b1 K = xbVar.v.K(b11);
                            if (K == null) {
                                break;
                            }
                            View view2 = K.a;
                            int top = view2.getTop();
                            if (view2 instanceof org.telegram.ui.Cells.u1) {
                                u1Var = (org.telegram.ui.Cells.u1) view2;
                                if (u1Var.h()) {
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
                    if (!u1Var.j() && layoutHeight > (y3 = (int) (u1Var.getY() + u1Var.getMeasuredHeight()))) {
                        layoutHeight = y3;
                    }
                    canvas.save();
                    if (checkBoxTranslation != 0.0f) {
                        canvas.translate(checkBoxTranslation, 0.0f);
                    }
                    if (u1Var.getCurrentMessagesGroup() != null && u1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        layoutHeight = (int) (layoutHeight - u1Var.getTranslationY());
                    }
                    if (z10) {
                        avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                    }
                    if (u1Var.a()) {
                        avatarImage.setAlpha(u1Var.getAlpha());
                        canvas.scale(u1Var.getScaleX(), u1Var.getScaleY(), u1Var.getPivotX() + u1Var.getX(), u1Var.getY() + (u1Var.getHeight() >> 1));
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
            if (!u1Var.getMessageObject().deleted) {
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.im0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        xb xbVar = this.V2;
        if (xbVar.v != null && xbVar.x != null && (i14 = xbVar.N0) >= 0) {
            if (xbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    tb tbVar = xbVar.E;
                    if (i15 < tbVar.d) {
                        if (i15 < tbVar.f || i15 >= tbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = tbVar.n.o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - tbVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == xbVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            xbVar.x.i1(i14, xbVar.O0, true);
            xbVar.N0 = -1;
            xbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
