package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fb0 extends f2.x {
    public final /* synthetic */ sb0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb0(sb0 sb0Var) {
        super(true);
        this.S = sb0Var;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        byte b10;
        sb0 sb0Var = this.S;
        MessageObject messageObject = sb0Var.r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = sb0.a(sb0Var, messageObject);
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

    @Override // f2.w, f2.j0, f2.w0
    public final void b0(bf.f fVar, f2.j1 j1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(fVar, j1Var);
            return;
        }
        try {
            super.b0(fVar, j1Var);
        } catch (Exception e6) {
            FileLog.e(e6);
            AndroidUtilities.runOnUIThread(new xp(this, 28));
        }
    }
}
