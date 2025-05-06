package com.google.firebase.encoders.config;

import com.google.firebase.encoders.ObjectEncoder;

/* loaded from: classes3.dex */
public interface EncoderConfig {
    EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder);
}
