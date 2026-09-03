package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class eb0 extends f2.x {
    public final /* synthetic */ rb0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb0(rb0 rb0Var) {
        super(true);
        this.S = rb0Var;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        byte b10;
        rb0 rb0Var = this.S;
        MessageObject messageObject = rb0Var.r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = rb0.a(rb0Var, messageObject);
        if (a2 != null) {
            MessageObject.GroupedMessagePosition position = a2.getPosition(messageObject);
            if (position.minX != position.maxX && (b10 = position.minY) == position.maxY && b10 != 0) {
                int size = a2.posArray.size();
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition = a2.posArray.get(i11);
                    if (groupedMessagePosition != position) {
                        byte b11 = groupedMessagePosition.minY;
                        byte b12 = position.minY;
                        if (b11 <= b12 && groupedMessagePosition.maxY >= b12) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // f2.x
    public final boolean C1(View view) {
        return false;
    }

    @Override // f2.w, f2.i0, f2.v0
    public final void b0(af.h hVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(hVar, i1Var);
            return;
        }
        try {
            super.b0(hVar, i1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new up(this, 28));
        }
    }
}
