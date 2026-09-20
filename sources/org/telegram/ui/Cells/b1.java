package org.telegram.ui.Cells;

import android.R;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1 b;

    public /* synthetic */ b1(int i10, u1 u1Var) {
        this.a = i10;
        this.b = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b3();
                break;
            case 1:
                u1 u1Var = this.b;
                l1 l1Var = u1Var.Jc;
                if (l1Var != null) {
                    l1Var.r(u1Var);
                    break;
                }
                break;
            case 2:
                this.b.H3();
                break;
            case 3:
                u1 u1Var2 = this.b;
                l.d dVar = u1Var2.w;
                dVar.I(u1Var2.Qd);
                dVar.I(u1Var2.Rd);
                u1Var2.H3();
                MessageObject messageObject = u1Var2.y7;
                if (messageObject != null) {
                    messageObject.generateLayout(null);
                    MessageObject messageObject2 = u1Var2.y7;
                    if (messageObject2.caption != null) {
                        messageObject2.caption = null;
                        messageObject2.generateCaption();
                    }
                    l1 l1Var2 = u1Var2.Jc;
                    if (l1Var2 != null) {
                        l1Var2.T(u1Var2);
                        break;
                    }
                }
                break;
            case 4:
                u1 u1Var3 = this.b;
                if (u1Var3.Q9 && !u1Var3.R9 && u1Var3.S9) {
                    u1Var3.R9 = true;
                    u1Var3.zc.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                    break;
                }
                break;
            case 5:
                u1 u1Var4 = this.b;
                u1Var4.zc.setState(new int[0]);
                u1Var4.invalidate();
                break;
            case 6:
                u1 u1Var5 = this.b;
                u1Var5.zc.setState(new int[0]);
                u1Var5.invalidate();
                break;
            case 7:
                u1 u1Var6 = this.b;
                int i10 = 0;
                u1Var6.x7 = false;
                u1Var6.getMessageObject().isSpoilersRevealed = true;
                MessageObject.TextLayoutBlocks textLayoutBlocks = u1Var6.h4;
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
                MessageObject.TextLayoutBlocks textLayoutBlocks2 = u1Var6.c4;
                if (textLayoutBlocks2 != null) {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList2 = textLayoutBlocks2.textLayoutBlocks;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        MessageObject.TextLayoutBlock textLayoutBlock2 = arrayList2.get(i10);
                        i10++;
                        textLayoutBlock2.spoilers.clear();
                    }
                } else {
                    ArrayList<MessageObject.TextLayoutBlock> arrayList3 = u1Var6.y7.textLayoutBlocks;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            MessageObject.TextLayoutBlock textLayoutBlock3 = arrayList3.get(i10);
                            i10++;
                            textLayoutBlock3.spoilers.clear();
                        }
                    }
                }
                u1Var6.invalidate();
                break;
            case 8:
                u1 u1Var7 = this.b;
                u1Var7.getMessageObject().replyMessageObject.isSpoilersRevealed = true;
                u1Var7.Ld.clear();
                u1Var7.invalidate();
                break;
            case 9:
                u1 u1Var8 = this.b;
                u1Var8.post(new b1(7, u1Var8));
                break;
            default:
                this.b.a3();
                break;
        }
    }
}
