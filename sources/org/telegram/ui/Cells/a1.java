package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                this.b.b3();
                break;
            case 1:
                s1 s1Var = this.b;
                j1 j1Var = s1Var.Jc;
                if (j1Var != null) {
                    j1Var.p(s1Var);
                    break;
                }
                break;
            case 2:
                this.b.J3();
                break;
            case 3:
                s1 s1Var2 = this.b;
                i2.c cVar = s1Var2.w;
                cVar.a(s1Var2.Qd);
                cVar.a(s1Var2.Rd);
                s1Var2.J3();
                MessageObject messageObject = s1Var2.y7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = s1Var2.y7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    j1 j1Var2 = s1Var2.Jc;
                    if (j1Var2 != null) {
                        j1Var2.Q(s1Var2);
                        break;
                    }
                }
                break;
            case 4:
                s1 s1Var3 = this.b;
                if (s1Var3.Q9 && !s1Var3.R9 && s1Var3.S9) {
                    s1Var3.R9 = true;
                    s1Var3.zc.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 5:
                s1 s1Var4 = this.b;
                s1Var4.zc.setState(new int[0]);
                s1Var4.invalidate();
                break;
            case 6:
                s1 s1Var5 = this.b;
                s1Var5.zc.setState(new int[0]);
                s1Var5.invalidate();
                break;
            case 7:
                s1 s1Var6 = this.b;
                int i10 = 0;
                s1Var6.x7 = false;
                s1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = s1Var6.h4;
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
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = s1Var6.c4;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = s1Var6.y7.textLayoutBlocks;
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
                s1Var7.Ld.clear();
                s1Var7.invalidate();
                break;
            case 9:
                s1 s1Var8 = this.b;
                s1Var8.post(new a1(7, s1Var8));
                break;
            default:
                this.b.a3();
                break;
        }
    }
}
