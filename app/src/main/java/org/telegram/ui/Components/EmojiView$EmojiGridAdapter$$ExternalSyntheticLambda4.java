package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.RecyclerListView;
/* loaded from: classes3.dex */
public final /* synthetic */ class EmojiView$EmojiGridAdapter$$ExternalSyntheticLambda4 implements RecyclerListView.OnItemClickListener {
    public final /* synthetic */ EmojiView.EmojiGridAdapter f$0;

    public /* synthetic */ EmojiView$EmojiGridAdapter$$ExternalSyntheticLambda4(EmojiView.EmojiGridAdapter emojiGridAdapter) {
        this.f$0 = emojiGridAdapter;
    }

    @Override // org.telegram.ui.Components.RecyclerListView.OnItemClickListener
    public final void onItemClick(View view, int i) {
        this.f$0.lambda$onCreateViewHolder$0(view, i);
    }
}
