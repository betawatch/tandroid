package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class eb extends nb {
    public final /* synthetic */ pb T2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(pb pbVar, Context context) {
        super(context, null);
        this.T2 = pbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver avatarImage;
        boolean z10;
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
            boolean z11 = t1Var.getMessageObject().deleted;
            pb pbVar = this.T2;
            if (!z11) {
                pbVar.A.getClass();
                if (RecyclerView.R(t1Var) != -1) {
                    z10 = true;
                    if (!t1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y11 = (int) view.getY();
                    if (t1Var.j() && (b10 = pbVar.A.T(view).b()) >= 0) {
                        if (pbVar.A.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = t1Var.getCheckBoxTranslation() + t1Var.getSlidingOffsetX();
                    int layoutHeight = t1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = pbVar.A.getMeasuredHeight() - pbVar.A.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (t1Var.h() && (r13 = pbVar.A.T(view).b()) >= 0) {
                        int i9 = 0;
                        while (i9 < 20) {
                            i9++;
                            int b11 = b11 - 1;
                            f2.q1 K = pbVar.A.K(b11);
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

    @Override // org.telegram.ui.Components.wk0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        MessageObject messageObject;
        pb pbVar = this.T2;
        if (pbVar.A != null && pbVar.C != null && (i13 = pbVar.N0) >= 0) {
            if (pbVar.M0 != 0) {
                int i14 = 0;
                while (true) {
                    lb lbVar = pbVar.E;
                    if (i14 < lbVar.d) {
                        if (i14 < lbVar.f || i14 >= lbVar.h) {
                            messageObject = null;
                        } else {
                            ArrayList arrayList = lbVar.n.o0;
                            messageObject = (MessageObject) arrayList.get((arrayList.size() - (i14 - lbVar.f)) - 1);
                        }
                        if (messageObject != null && messageObject.eventId == pbVar.M0) {
                            i13 = i14;
                            break;
                        }
                        i14++;
                    } else {
                        break;
                    }
                }
            }
            pbVar.C.i1(i13, pbVar.O0, true);
            pbVar.N0 = -1;
            pbVar.M0 = 0L;
        }
        super.onLayout(z10, i9, i10, i11, i12);
    }
}
