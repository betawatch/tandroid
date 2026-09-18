package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class s11 extends wl0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.X2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.wl0
    public final boolean F0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.X2.E) + AndroidUtilities.statusBarHeight));
    }
}
