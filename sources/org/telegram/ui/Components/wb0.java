package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wb0 extends s4.u {
    public final /* synthetic */ ic0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(ic0 ic0Var) {
        super(true);
        this.S = ic0Var;
    }

    @Override // s4.u
    public final boolean C1(int i10) {
        byte b10;
        ic0 ic0Var = this.S;
        MessageObject messageObject = ic0Var.r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = ic0.a(ic0Var, messageObject);
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

    @Override // s4.u
    public final boolean D1(View view) {
        return false;
    }

    @Override // s4.t, s4.c0, s4.p0
    public final void b0(rf.e eVar, s4.b1 b1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, b1Var);
            return;
        }
        try {
            super.b0(eVar, b1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new xa0(this, 1));
        }
    }
}
