package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ a1(int i10, t1 t1Var) {
        this.a = i10;
        this.b = t1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b3();
                break;
            case 1:
                t1 t1Var = this.b;
                k1 k1Var = t1Var.Gc;
                if (k1Var != null) {
                    k1Var.q(t1Var);
                    break;
                }
                break;
            case 2:
                this.b.H3();
                break;
            case 3:
                t1 t1Var2 = this.b;
                oh.h4 h4Var = t1Var2.w;
                h4Var.Y(t1Var2.Nd);
                h4Var.Y(t1Var2.Od);
                t1Var2.H3();
                MessageObject messageObject = t1Var2.v7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = t1Var2.v7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    k1 k1Var2 = t1Var2.Gc;
                    if (k1Var2 != null) {
                        k1Var2.T(t1Var2);
                        break;
                    }
                }
                break;
            case 4:
                t1 t1Var3 = this.b;
                if (t1Var3.N9 && !t1Var3.O9 && t1Var3.P9) {
                    t1Var3.O9 = true;
                    t1Var3.wc.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 5:
                t1 t1Var4 = this.b;
                t1Var4.wc.setState(new int[0]);
                t1Var4.invalidate();
                break;
            case 6:
                t1 t1Var5 = this.b;
                t1Var5.wc.setState(new int[0]);
                t1Var5.invalidate();
                break;
            case 7:
                t1 t1Var6 = this.b;
                int i10 = 0;
                t1Var6.u7 = false;
                t1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = t1Var6.e4;
                if (textLayoutBlocks != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = textLayoutBlocks.textLayoutBlocks;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                        i11++;
                        textLayoutBlock.spoilers.clear();
                    }
                }
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = t1Var6.Z3;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = t1Var6.v7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i10);
                            i10++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                t1Var6.invalidate();
                break;
            case 8:
                t1 t1Var7 = this.b;
                t1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                t1Var7.Id.clear();
                t1Var7.invalidate();
                break;
            case 9:
                t1 t1Var8 = this.b;
                t1Var8.post(new a1(7, t1Var8));
                break;
            default:
                this.b.a3();
                break;
        }
    }
}
