package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j3) {
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
        boolean drawChild = super.drawChild(canvas, view, j3);
        if ((view instanceof org.telegram.ui.Cells.u1) && (avatarImage = (u1Var = (org.telegram.ui.Cells.u1) view).getAvatarImage()) != null) {
            boolean z11 = u1Var.getMessageObject().deleted;
            ub ubVar = this.X2;
            if (!z11) {
                ubVar.v.getClass();
                if (RecyclerView.R(u1Var) != -1) {
                    z10 = true;
                    if (!u1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y10 = (int) view.getY();
                    if (u1Var.j() && (b10 = ubVar.v.T(view).b()) >= 0) {
                        if (ubVar.v.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = u1Var.getCheckBoxTranslation() + u1Var.getSlidingOffsetX();
                    int layoutHeight = u1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = ubVar.v.getMeasuredHeight() - ubVar.v.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (u1Var.h() && (r13 = ubVar.v.T(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            s4.c1 K = ubVar.v.K(b11);
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

    @Override // org.telegram.ui.Components.wl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        ub ubVar = this.X2;
        if (ubVar.v != null && ubVar.x != null && (i14 = ubVar.N0) >= 0) {
            if (ubVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    qb qbVar = ubVar.E;
                    if (i15 < qbVar.d) {
                        if (i15 < qbVar.f || i15 >= qbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = qbVar.n.o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - qbVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == ubVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            ubVar.x.i1(i14, ubVar.O0, true);
            ubVar.N0 = -1;
            ubVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
