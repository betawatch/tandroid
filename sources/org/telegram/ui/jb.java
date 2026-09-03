package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class jb extends sb {
    public final /* synthetic */ ub U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(ub ubVar, Context context) {
        super(context, null);
        this.U2 = ubVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver avatarImage;
        boolean z4;
        int y10;
        int b10;
        if (view instanceof org.telegram.ui.Cells.t1) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            ((org.telegram.ui.Cells.t1) view).a(canvas);
            canvas.restore();
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if ((view instanceof org.telegram.ui.Cells.s1) && (avatarImage = (s1Var = (org.telegram.ui.Cells.s1) view).getAvatarImage()) != null) {
            boolean z10 = s1Var.getMessageObject().deleted;
            ub ubVar = this.U2;
            if (!z10) {
                ubVar.B.getClass();
                if (RecyclerView.R(s1Var) != -1) {
                    z4 = true;
                    if (!s1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y11 = (int) view.getY();
                    if (s1Var.j() && (b10 = ubVar.B.T(view).b()) >= 0) {
                        if (ubVar.B.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                    int layoutHeight = s1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = ubVar.B.getMeasuredHeight() - ubVar.B.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (s1Var.h() && (r13 = ubVar.B.T(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            f2.l1 K = ubVar.B.K(b11);
                            if (K == null) {
                                break;
                            }
                            View view2 = K.a;
                            int top = view2.getTop();
                            if (view2 instanceof org.telegram.ui.Cells.s1) {
                                s1Var = (org.telegram.ui.Cells.s1) view2;
                                if (s1Var.h()) {
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
                    if (!s1Var.j() && layoutHeight > (y10 = (int) (s1Var.getY() + s1Var.getMeasuredHeight()))) {
                        layoutHeight = y10;
                    }
                    canvas.save();
                    if (checkBoxTranslation != 0.0f) {
                        canvas.translate(checkBoxTranslation, 0.0f);
                    }
                    if (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        layoutHeight = (int) (layoutHeight - s1Var.getTranslationY());
                    }
                    if (z4) {
                        avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                    }
                    if (s1Var.a()) {
                        avatarImage.setAlpha(s1Var.getAlpha());
                        canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX() + s1Var.getX(), s1Var.getY() + (s1Var.getHeight() >> 1));
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
            if (!s1Var.getMessageObject().deleted) {
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        ub ubVar = this.U2;
        if (ubVar.B != null && ubVar.D != null && (i14 = ubVar.O0) >= 0) {
            if (ubVar.N0 != 0) {
                int i15 = 0;
                while (true) {
                    qb qbVar = ubVar.F;
                    if (i15 < qbVar.d) {
                        if (i15 < qbVar.f || i15 >= qbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = qbVar.n.p0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - qbVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == ubVar.N0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            ubVar.D.i1(i14, ubVar.P0, true);
            ubVar.O0 = -1;
            ubVar.N0 = 0L;
        }
        super.onLayout(z4, i10, i11, i12, i13);
    }
}
