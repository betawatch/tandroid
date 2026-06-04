package org.telegram.messenger.pip.activity;

/* loaded from: classes3.dex */
public interface IPipActivityListener {

    public abstract /* synthetic */ class -CC {
        public static void $default$onCompleteEnterToPip(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onStartEnterToPip(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onStartExitFromPip(IPipActivityListener iPipActivityListener, boolean z) {
        }
    }

    void onCompleteEnterToPip();

    void onCompleteExitFromPip(boolean z);

    void onStartEnterToPip();

    void onStartExitFromPip(boolean z);
}
