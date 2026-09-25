package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class gj0 extends xg.c {
    @Override // xg.c
    public final int getHeaderHeight() {
        return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
    }
}
