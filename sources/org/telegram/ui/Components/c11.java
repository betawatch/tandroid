package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ThemeEditorView;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class c11 extends ll0 {
    public final /* synthetic */ ThemeEditorView.EditorAlert X2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c11(ThemeEditorView.EditorAlert editorAlert, Context context) {
        super(context, null);
        this.X2 = editorAlert;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean E0(float f7) {
        return f7 >= ((float) ((AndroidUtilities.dp(48.0f) + this.X2.E) + AndroidUtilities.statusBarHeight));
    }
}
