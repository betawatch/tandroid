package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class z11 extends im0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.V2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.V2.E) + AndroidUtilities.statusBarHeight));
    }
}
