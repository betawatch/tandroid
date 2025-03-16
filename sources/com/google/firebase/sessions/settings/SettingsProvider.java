package com.google.firebase.sessions.settings;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.time.Duration;

/* loaded from: classes3.dex */
public interface SettingsProvider {

    public static final class DefaultImpls {
        public static Object updateSettings(SettingsProvider settingsProvider, Continuation continuation) {
            return Unit.INSTANCE;
        }
    }

    Double getSamplingRate();

    Boolean getSessionEnabled();

    Duration getSessionRestartTimeout-FghU774();

    Object updateSettings(Continuation continuation);
}
