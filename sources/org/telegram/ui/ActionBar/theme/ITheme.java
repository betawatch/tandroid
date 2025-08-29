package org.telegram.ui.ActionBar.theme;

import org.telegram.tgnet.TLRPC;

/* loaded from: classes4.dex */
public interface ITheme {
    long getThemeId();

    TLRPC.ThemeSettings getThemeSettings(int i);
}
