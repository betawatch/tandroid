package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class db0 extends s4.t {
    public final /* synthetic */ qb0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db0(qb0 qb0Var) {
        super(true);
        this.S = qb0Var;
    }

    @Override // s4.t
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

    @Override // s4.t
    public final boolean C1(View view) {
        return false;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final void b0(pf.e eVar, s4.z0 z0Var) {
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            super.b0(eVar, z0Var);
            return;
        }
        try {
            super.b0(eVar, z0Var);
        } catch (Exception e7) {
            FileLog.e(e7);
            AndroidUtilities.runOnUIThread(new wp(this, 28));
        }
    }
}
