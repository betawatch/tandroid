package org.telegram.ui.Components.chat;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* loaded from: classes5.dex */
public class ChatListViewPaddingsAnimator {
    private int currentAdditionalHeight;
    private final RecyclerView recyclerView;

    public ChatListViewPaddingsAnimator(RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public void setPaddings(int i, float f, boolean z) {
        int i2 = this.currentAdditionalHeight;
        if (i2 != 0) {
            this.currentAdditionalHeight = 0;
            this.recyclerView.requestLayout();
        } else if (i2 < 0) {
            this.currentAdditionalHeight = 0;
            this.recyclerView.requestLayout();
        }
        int i3 = (int) f;
        int paddingTop = this.recyclerView.getPaddingTop();
        int paddingBottom = this.recyclerView.getPaddingBottom();
        if (paddingTop == i && paddingBottom == i3) {
            return;
        }
        final int i4 = paddingTop - i;
        if (z && i4 != 0) {
            AndroidUtilities.doOnLayout(this.recyclerView, new Runnable() { // from class: org.telegram.ui.Components.chat.ChatListViewPaddingsAnimator$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    ChatListViewPaddingsAnimator.this.lambda$setPaddings$0(i4);
                }
            });
        }
        RecyclerView recyclerView = this.recyclerView;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), i, this.recyclerView.getPaddingRight(), i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setPaddings$0(int i) {
        try {
            this.recyclerView.scrollBy(0, i);
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    public int getCurrentAdditionalHeight() {
        return this.currentAdditionalHeight;
    }
}
