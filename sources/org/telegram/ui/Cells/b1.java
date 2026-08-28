package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t1 b;

    public /* synthetic */ b1(int i9, t1 t1Var) {
        this.a = i9;
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
                k1 k1Var = t1Var.Fc;
                if (k1Var != null) {
                    k1Var.v(t1Var);
                    break;
                }
                break;
            case 2:
                this.b.H3();
                break;
            case 3:
                t1 t1Var2 = this.b;
                i8.i0 i0Var = t1Var2.w;
                i0Var.a(t1Var2.Md);
                i0Var.a(t1Var2.Nd);
                t1Var2.H3();
                MessageObject messageObject = t1Var2.u7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = t1Var2.u7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    k1 k1Var2 = t1Var2.Fc;
                    if (k1Var2 != null) {
                        k1Var2.a0(t1Var2);
                        break;
                    }
                }
                break;
            case 4:
                t1 t1Var3 = this.b;
                if (t1Var3.M9 && !t1Var3.N9 && t1Var3.O9) {
                    t1Var3.N9 = true;
                    t1Var3.vc.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 5:
                t1 t1Var4 = this.b;
                t1Var4.vc.setState(new int[0]);
                t1Var4.invalidate();
                break;
            case 6:
                t1 t1Var5 = this.b;
                t1Var5.vc.setState(new int[0]);
                t1Var5.invalidate();
                break;
            case 7:
                t1 t1Var6 = this.b;
                int i9 = 0;
                t1Var6.t7 = false;
                t1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = t1Var6.d4;
                if (textLayoutBlocks != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList = textLayoutBlocks.textLayoutBlocks;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                        i10++;
                        textLayoutBlock.spoilers.clear();
                    }
                }
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = t1Var6.Y3;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i9 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i9);
                        i9++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = t1Var6.u7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i9 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i9);
                            i9++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                t1Var6.invalidate();
                break;
            case 8:
                t1 t1Var7 = this.b;
                t1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                t1Var7.Hd.clear();
                t1Var7.invalidate();
                break;
            case 9:
                t1 t1Var8 = this.b;
                t1Var8.post(new b1(7, t1Var8));
                break;
            default:
                this.b.a3();
                break;
        }
    }
}
