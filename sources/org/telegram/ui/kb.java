package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class kb extends tb {
    public final /* synthetic */ vb Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb(vb vbVar, Context context) {
        super(context, null);
        this.Y2 = vbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
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
        boolean drawChild = super.drawChild(canvas, view, j10);
        if ((view instanceof org.telegram.ui.Cells.t1) && (avatarImage = (t1Var = (org.telegram.ui.Cells.t1) view).getAvatarImage()) != null) {
            boolean z11 = t1Var.getMessageObject().deleted;
            vb vbVar = this.Y2;
            if (!z11) {
                vbVar.v.getClass();
                if (RecyclerView.R(t1Var) != -1) {
                    z10 = true;
                    if (!t1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y10 = (int) view.getY();
                    if (t1Var.i() && (b10 = vbVar.v.T(view).b()) >= 0) {
                        if (vbVar.v.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                    int layoutHeight = t1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = vbVar.v.getMeasuredHeight() - vbVar.v.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (t1Var.g() && (r13 = vbVar.v.T(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            s4.b1 K = vbVar.v.K(b11);
                            if (K == null) {
                                break;
                            }
                            View view2 = K.a;
                            int top = view2.getTop();
                            if (view2 instanceof org.telegram.ui.Cells.t1) {
                                t1Var = (org.telegram.ui.Cells.t1) view2;
                                if (t1Var.g()) {
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
                    if (!t1Var.i() && layoutHeight > (y3 = (int) (t1Var.getY() + t1Var.getMeasuredHeight()))) {
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
                    if (t1Var.c()) {
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

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        vb vbVar = this.Y2;
        if (vbVar.v != null && vbVar.x != null && (i14 = vbVar.N0) >= 0) {
            if (vbVar.M0 != 0) {
                int i15 = 0;
                while (true) {
                    rb rbVar = vbVar.E;
                    if (i15 < rbVar.d) {
                        if (i15 < rbVar.f || i15 >= rbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = rbVar.n.o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i15 - rbVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == vbVar.M0) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    } else {
                        break;
                    }
                }
            }
            vbVar.x.i1(i14, vbVar.O0, true);
            vbVar.N0 = -1;
            vbVar.M0 = 0L;
        }
        super.onLayout(z10, i10, i11, i12, i13);
    }
}
