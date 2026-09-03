package hg;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class p2 extends lg.d {
    @Override // lg.d
    public final int getHeaderHeight() {
        return getResources().getConfiguration().orientation == 2 ? AndroidUtilities.dp(48.0f) : AndroidUtilities.dp(54.0f);
    }
}
