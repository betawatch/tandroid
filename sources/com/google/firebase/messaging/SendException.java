package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes.dex */
public final class SendException extends Exception {
    private final int errorCode;

    SendException(String str) {
        super(str);
        this.errorCode = parseErrorCode(str);
    }

    private int parseErrorCode(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        switch (lowerCase) {
        }
        return 0;
    }
}
