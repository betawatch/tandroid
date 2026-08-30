package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class db0 extends f2.x {
    public final /* synthetic */ qb0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(qb0 qb0Var) {
        super(true);
        this.S = qb0Var;
    }

    @Override // f2.x
    public final boolean B1(int i10) {
        byte b10;
        qb0 qb0Var = this.S;
        MessageObject messageObject = qb0Var.r.previewMessages.get(i10);
        MessageObject.GroupedMessages a2 = qb0.a(qb0Var, messageObject);
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
    public final void b0(bf.f fVar, f2.i1 i1Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(fVar, i1Var);
            return;
        }
        try {
            super.b0(fVar, i1Var);
        } catch (Exception e) {
            FileLog.e(e);
            AndroidUtilities.runOnUIThread(new vp(this, 28));
        }
    }
}
