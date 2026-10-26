package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class lb extends ub {
    public final /* synthetic */ wb f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(wb wbVar, Context context) {
        super(context, null);
        this.f3 = wbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver avatarImage;
        boolean z10;
        int y3;
        int b10;
        if (view instanceof org.telegram.ui.Cells.t1) {
            canvas.save();
            canvas.translate(view.getX(), view.getY());
            ((org.telegram.ui.Cells.t1) view).a(canvas);
            canvas.restore();
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if ((view instanceof org.telegram.ui.Cells.s1) && (avatarImage = (s1Var = (org.telegram.ui.Cells.s1) view).getAvatarImage()) != null) {
            boolean z11 = s1Var.getMessageObject().deleted;
            wb wbVar = this.f3;
            if (!z11) {
                wbVar.v.getClass();
                if (RecyclerView.R(s1Var) != -1) {
                    z10 = true;
                    if (!s1Var.getMessageObject().deleted) {
                        avatarImage.setVisible(false, false);
                        return drawChild;
                    }
                    int y10 = (int) view.getY();
                    if (s1Var.i() && (b10 = wbVar.v.T(view).b()) >= 0) {
                        if (wbVar.v.K(b10 + 1) != null) {
                            avatarImage.setVisible(false, false);
                            return drawChild;
                        }
                    }
                    float checkBoxTranslation = s1Var.getCheckBoxTranslation() + s1Var.getSlidingOffsetX();
                    int layoutHeight = s1Var.getLayoutHeight() + ((int) view.getY());
                    int measuredHeight = wbVar.v.getMeasuredHeight() - wbVar.v.getPaddingBottom();
                    if (layoutHeight > measuredHeight) {
                        layoutHeight = measuredHeight;
                    }
                    if (s1Var.g() && (r13 = wbVar.v.T(view).b()) >= 0) {
                        int i10 = 0;
                        while (i10 < 20) {
                            i10++;
                            int b11 = b11 - 1;
                            s4.e1 K = wbVar.v.K(b11);
                            if (K == null) {
                                break;
                            }
                            View view2 = K.a;
                            int top = view2.getTop();
                            if (view2 instanceof org.telegram.ui.Cells.s1) {
                                s1Var = (org.telegram.ui.Cells.s1) view2;
                                if (s1Var.g()) {
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
                    if (!s1Var.i() && layoutHeight > (y3 = (int) (s1Var.getY() + s1Var.getMeasuredHeight()))) {
                        layoutHeight = y3;
                    }
                    canvas.save();
                    if (checkBoxTranslation != 0.0f) {
                        canvas.translate(checkBoxTranslation, 0.0f);
                    }
                    if (s1Var.getCurrentMessagesGroup() != null && s1Var.getCurrentMessagesGroup().transitionParams.backgroundChangeBounds) {
                        layoutHeight = (int) (layoutHeight - s1Var.getTranslationY());
                    }
                    if (z10) {
                        avatarImage.setImageY(layoutHeight - AndroidUtilities.dp(44.0f));
                    }
                    if (s1Var.a()) {
                        avatarImage.setAlpha(s1Var.getAlpha());
                        canvas.scale(s1Var.getScaleX(), s1Var.getScaleY(), s1Var.getPivotX() + s1Var.getX(), s1Var.getY() + (s1Var.getHeight() >> 1));
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
            if (!s1Var.getMessageObject().deleted) {
            }
        }
        return drawChild;
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        MessageObject messageObject;
        wb wbVar = this.f3;
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
