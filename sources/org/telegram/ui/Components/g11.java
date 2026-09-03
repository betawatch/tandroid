package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g11 extends rl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.U2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean E0(float f10) {
        return f10 >= ((float) ((AndroidUtilities.dp(48.0f) + this.U2.B) + AndroidUtilities.statusBarHeight));
    }
}
