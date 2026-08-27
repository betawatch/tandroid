package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s1 b;

    public /* synthetic */ a1(int i10, s1 s1Var) {
        this.a = i10;
        this.b = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a3();
                break;
            case 1:
                s1 s1Var = this.b;
                j1 j1Var = s1Var.Fc;
                if (j1Var != null) {
                    j1Var.t(s1Var);
                    break;
                }
                break;
            case 2:
                this.b.G3();
                break;
            case 3:
                s1 s1Var2 = this.b;
                m5.o oVar = s1Var2.w;
                oVar.s(s1Var2.Md);
                oVar.s(s1Var2.Nd);
                s1Var2.G3();
                MessageObject messageObject = s1Var2.u7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = s1Var2.u7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    j1 j1Var2 = s1Var2.Fc;
                    if (j1Var2 != null) {
                        j1Var2.Z(s1Var2);
                        break;
                    }
                }
                break;
            case 4:
                s1 s1Var3 = this.b;
                if (s1Var3.M9 && !s1Var3.N9 && s1Var3.O9) {
                    s1Var3.N9 = true;
                    s1Var3.vc.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 5:
                s1 s1Var4 = this.b;
                s1Var4.vc.setState(new int[0]);
                s1Var4.invalidate();
                break;
            case 6:
                s1 s1Var5 = this.b;
                s1Var5.vc.setState(new int[0]);
                s1Var5.invalidate();
                break;
            case 7:
                s1 s1Var6 = this.b;
                int i10 = 0;
                s1Var6.t7 = false;
                s1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var6.d4;
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
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = s1Var6.Y3;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = s1Var6.u7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i10);
                            i10++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                s1Var6.invalidate();
                break;
            case 8:
                s1 s1Var7 = this.b;
                s1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                s1Var7.Hd.clear();
                s1Var7.invalidate();
                break;
            case 9:
                s1 s1Var8 = this.b;
                s1Var8.post(new a1(7, s1Var8));
                break;
            default:
                this.b.Z2();
                break;
        }
    }
}
